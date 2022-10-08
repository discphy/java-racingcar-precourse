package racingcar.domain;

public class Racing {

    private final Cars cars;
    private final Track track;
    private final Winners winners;

    public Racing(Cars cars, Track track) {
        this.cars = cars;
        this.track = track;
        this.winners = new Winners();
    }

    public static Racing of(Cars cars, Track track) {
        return new Racing(cars, track);
    }

    public Cars getCars() {
        return cars;
    }

    public Track getTrack() {
        return track;
    }

    public Winners getWinners() {
        return winners;
    }

    public boolean isEnd() {
        return !winners.isEmpty();
    }
}
