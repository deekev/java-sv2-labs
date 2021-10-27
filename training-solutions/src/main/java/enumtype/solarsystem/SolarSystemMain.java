package enumtype.solarsystem;

public class SolarSystemMain {

    public static void main(String[] args) {

        System.out.println(SolarSystem.MERCURY + "'s moons: " + SolarSystem.MERCURY.getNumberOfMoons());
        System.out.println(SolarSystem.VENUS + "'s moons: " + SolarSystem.VENUS.getNumberOfMoons());
        System.out.println(SolarSystem.EARTH + "'s moons: " + SolarSystem.EARTH.getNumberOfMoons());
        System.out.println(SolarSystem.MARS + "'s moons: " + SolarSystem.MARS.getNumberOfMoons());
        System.out.println(SolarSystem.JUPITER + "'s moons: " + SolarSystem.JUPITER.getNumberOfMoons());
        System.out.println(SolarSystem.SATURN + "'s moons: " + SolarSystem.SATURN.getNumberOfMoons());
        System.out.println(SolarSystem.URANUS + "'s moons: " + SolarSystem.URANUS.getNumberOfMoons());
        System.out.println(SolarSystem.NEPTUNE + "'s moons: " + SolarSystem.NEPTUNE.getNumberOfMoons());
    }
}