package racingcar.service;

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
        return new CarsDto(inputService.getCars()).toDomain();
    }

    public Track initTrack() {
        return new TrackDto(inputService.getTrack()).toDomain();
    }
}
