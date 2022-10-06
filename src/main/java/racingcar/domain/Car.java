package racingcar.domain;

public class Car {
    private String name;

    public Car(String name) {
        validationName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validationName(String name) {
        if (name.length() < 1 || name.length() > 5) {
            throw new IllegalArgumentException("자동차 입력 값이 유효하지 않습니다.");
        }
    }

    public static Car of(String name) {
        return new Car(name.trim());
    }
}
