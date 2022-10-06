package racingcar.service;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class RacingService {

    public Cars toCars(String input) {
        String[] inputArray = input.split(",");
        List<Car> cars = new ArrayList<>();

        for (String name : inputArray) {
            cars.add(Car.of(name));
        }

        return Cars.of(cars);
    }
}
