package racingcar.domain;

public class Car {

    private final String name;
    private int move;

    public Car(String name) {
        validationName(name);
        this.name = name;
        this.move = 0;
    }

    public String getName() {
        return name;
    }

    public int getMove() {
        return move;
    }

    public void goMove() {
        move++;
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
