package racingcar.service;

import org.junit.jupiter.api.Test;
import racingcar.TestCase;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Track;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingServiceTest {

    @Test
    void InputTestCaseService_Cars_객체_받아오기() {
        //given
        RacingService racingService = new RacingService(new InputTestCaseService(TestCase.CASE2));

        //when
        Cars cars = racingService.initCars();
        Car car = cars.getList().get(1);

        //then
        assertThat(car.getName()).isEqualTo("bmw");
    }

    @Test
    void InputTestCaseService_Track_객체_받아오기() {
        //given
        RacingService racingService = new RacingService(new InputTestCaseService(TestCase.CASE2));

        //when
        Track track = racingService.initTrack();

        //then
        assertThat(track.getCount()).isEqualTo(5);
    }
}
