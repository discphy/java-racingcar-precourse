package racingcar.service;

import racingcar.domain.Car;
import racingcar.domain.Racing;
import racingcar.value.OutputMessage;
import racingcar.domain.Cars;
import racingcar.domain.Track;
import racingcar.dto.CarsDto;
import racingcar.dto.TrackDto;

public class RacingService {

    private final Carservice carservice;
    private final InputService inputService;
    private final Racing racing;

    public RacingService(InputService inputService) {
        this.carservice = new Carservice();
        this.inputService = inputService;
        this.racing = ready();
    }

    public Racing ready() {
        return Racing.of(initCars(), initTrack());
    }

    public Cars initCars() {
        try {
            OutputService.printInput(OutputMessage.INPUT_CAR);
            return new CarsDto(inputService.getCars()).toDomain();
        } catch (IllegalArgumentException e) {
            OutputService.inputArgumentError(e);
            return initCars();
        }
    }

    public Track initTrack() {
        try {
            OutputService.printInput(OutputMessage.INPUT_TRACK);
            return new TrackDto(inputService.getTrack()).toDomain();
        } catch (IllegalArgumentException e) {
            OutputService.inputArgumentError(e);
            return initTrack();
        }
    }

    public void start() {
        OutputService.printExecute();

        do {
            carRacing();
            OutputService.printLine();
        } while (!racing.isEnd());

        OutputService.printWinner(racing.getWinners());
    }

    public void carRacing() {
        for (Car car : racing.getCars().getList()) {
            moveCar(car);
            winnerCar(car);
        }
    }

    private void winnerCar(Car car) {
        if (car.getMove() == racing.getTrack().getCount()) {
            racing.getWinners().add(car);
        }
    }

    private void moveCar(Car car) {
        carservice.move(car);
    }
}
