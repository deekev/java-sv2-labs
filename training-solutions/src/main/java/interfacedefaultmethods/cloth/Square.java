package interfacedefaultmethods.cloth;

public interface Square {

    static final int NUMBER_OF_SIDES = 4;

    default int getNumberOfSides() {
        return NUMBER_OF_SIDES;
    }

    default double getLengthOfDiagonal() {
        return getSide() * Math.sqrt(2);
    }

    default double getPerimeter() {
        return getSide() * getNumberOfSides();
    }

    default double getArea() {
        return getSide() * getSide();
    }

    abstract double getSide();
}