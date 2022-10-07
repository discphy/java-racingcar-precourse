package racingcar.service;

import racingcar.value.OutputMessage;
import racingcar.domain.Cars;
import racingcar.domain.Track;
import racingcar.dto.CarsDto;
import racingcar.dto.TrackDto;

public class RacingService {

    private final InputService inputService;

    public RacingService(InputService inputService) {
        this.inputService = inputService;
    }

    public Cars initCars() {
        try {
            OutputService.printMessage(OutputMessage.INPUT_CAR);
            return new CarsDto(inputService.getCars()).toDomain();
        } catch (IllegalArgumentException e) {
            OutputService.inputArgumentError(e);
            return initCars();
        }
    }

    public Track initTrack() {
        try {
            OutputService.printMessage(OutputMessage.INPUT_TRACK);
            return new TrackDto(inputService.getTrack()).toDomain();
        } catch (IllegalArgumentException e) {
            OutputService.inputArgumentError(e);
            return initTrack();
        }
    }
}
