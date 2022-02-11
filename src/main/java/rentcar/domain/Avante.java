package rentcar.domain;

public class Avante extends Car {

    private static final String CAR_NAME = "avante";
    private static final double DISTANCE_PER_LITER = 15;
    private final double distance;

    public Avante(final double distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 0;
    }

    @Override
    double getTripDistance() {
        return 0;
    }

    @Override
    String getName() {
        return null;
    }
}
