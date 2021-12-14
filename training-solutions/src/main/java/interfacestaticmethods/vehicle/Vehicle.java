package interfacestaticmethods.vehicle;

public interface Vehicle {

    static Vehicle of(int numberOfWheels) {
        if (numberOfWheels == 2) {
            return new Bicycle(numberOfWheels);
        }
        if (numberOfWheels == 4) {
            return new Car(numberOfWheels);
        }
        throw new IllegalArgumentException("This is neither a bicycle nor a car.");
    }
}