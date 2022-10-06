package racingcar.service;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Track;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingServiceTest {
    @Test
    void 카_리스트_변환() {
        //given
        String carsString = "k3, k5, k7, k9";
        String[] carsArray = carsString.split(",");
        List<Car> list = new ArrayList<>();

        //when
        for (String car : carsArray) {
            list.add(Car.of(car));
        }

        Cars cars = new Cars(list);
        Car car = cars.getList().get(2);

        assertThat(car.getName()).isEqualTo("k7");
    }

    @Test
    void 카_리스트_변환_서비스_구현() {
        //given
        String carsString = "k3, k5, k7, k9";

        //when
        Cars cars = new RacingService().toCars(carsString);
        Car car = cars.getList().get(2);

        assertThat(car.getName()).isEqualTo("k7");
    }
}
