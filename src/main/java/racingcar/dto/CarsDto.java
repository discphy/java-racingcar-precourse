package racingcar.dto;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarsDto {

    private final String input;

    public CarsDto(String input) {
        this.input = input;
    }

    public Cars toDomain() {
        List<Car> cars = new ArrayList<>();

        for (String carName : getArray()) {
            cars.add(Car.of(carName));
        }

        return Cars.of(cars);
    }

    private String[] getArray() {
        return input.split(",");
    }
}
