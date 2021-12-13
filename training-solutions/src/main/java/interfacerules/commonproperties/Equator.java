package interfacerules.commonproperties;

public class Equator implements Name, Length {

    public static final String NAME = "Equator";
    public static final double LENGTH = 40_075d;

    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }
}