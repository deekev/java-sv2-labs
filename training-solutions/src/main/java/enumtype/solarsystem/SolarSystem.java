package enumtype.solarsystem;

public enum SolarSystem {

    MERCURY(0), VENUS(0), EARTH(1), MARS(2),
    JUPITER(12), SATURN(13), URANUS(6), NEPTUNE(9);

    private final int numberOfMoons;

    SolarSystem(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }
}