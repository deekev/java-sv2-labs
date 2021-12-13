package interfaces.animal;

public class Worm implements Animal {

    public static final int NUMBER_OF_LEGS = 0;
    public static final String NAME_OF_CLASS = "Worm";

    @Override
    public int getNumberOfLegs() {
        return NUMBER_OF_LEGS;
    }

    @Override
    public String getName() {
        return NAME_OF_CLASS;
    }
}
