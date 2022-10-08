package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    private final List<Car> list;

    public Winners() {
        list = new ArrayList<>();
    }

    public void add(Car car) {
        list.add(car);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Car car : list) {
            builder.append(builder.length() != 0 ? ", " : "").append(car.getName());
        }

        return builder.toString();
    }
}
