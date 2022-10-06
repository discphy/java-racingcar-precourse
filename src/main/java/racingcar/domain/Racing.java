package racingcar.domain;

public class Racing {

    private final Cars cars;
    private final Track track;

    public Racing(Cars cars, Track track) {
        this.cars = cars;
        this.track = track;
    }

    public Cars getCars() {
        return cars;
    }

    public Track getTrack() {
        return track;
    }
}
