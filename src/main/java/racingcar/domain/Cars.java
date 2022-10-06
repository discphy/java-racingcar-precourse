package racingcar.domain;

import java.util.List;

public class Cars {

    private final int MIN_COUNT = 2;
    private final List<Car> list;


    public Cars(List<Car> cars) {
        validationSize(cars);
        this.list = cars;
    }

    public List<Car> getList() {
        return list;
    }

    private void validationSize(List<Car> cars) {
        if (cars.size() < MIN_COUNT) {
            throw new IllegalArgumentException("자동차 경주를 위한 최소 2대의 자동차가 필요합니다.");
        }
    }

    public static Cars of(List<Car> cars) {
        return new Cars(cars);
    }
}
