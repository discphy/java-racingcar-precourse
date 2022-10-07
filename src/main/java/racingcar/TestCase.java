package racingcar;

public enum TestCase {

    CASE1("k3, k5, k7, k9", "3"),
    CASE2("audi, bmw, benz", "5");

    private final String cars;
    private final String count;

    TestCase(String cars, String count) {
        this.cars = cars;
        this.count = count;
    }

    public String getCars() {
        return cars;
    }

    public String getCount() {
        return count;
    }
}
