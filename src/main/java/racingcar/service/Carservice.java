package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;

public class Carservice {

    public void move(Car car) {
        move(car, Randoms.pickNumberInRange(0, 9));
    }

    public void move(Car car, int number) {
        if (isMove(number)) car.goMove();
        OutputService.printMove(car);
    }

    public boolean isMove(int number) {
        return number >= 4;
    }
}
