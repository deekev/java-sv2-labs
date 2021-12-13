package interfaces.animal;

public class Duck implements Animal {

    public static final int NUMBER_OF_LEGS = 2;
    public static final String NAME_OF_CLASS = "Duck";

    @Override
    public int getNumberOfLegs() {
        return NUMBER_OF_LEGS;
    }

    @Override
    public String getName() {
        return NAME_OF_CLASS;
    }
}