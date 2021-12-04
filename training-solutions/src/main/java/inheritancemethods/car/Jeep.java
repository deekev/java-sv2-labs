package inheritancemethods.car;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraCapacity < extraFuel) {
            throw new IllegalArgumentException("Not enough tank capacity.");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        super.modifyFuelAmount(fuel);
    }

    @Override
    public void drive(int km) {
        if (isEnoughFuel(km)) {
            double usedFuel = km * (super.getFuelRate() / 100D);
            extraFuel -= usedFuel;
            if (extraFuel < 0) {
                modifyFuelAmount(extraFuel);
                extraFuel = 0;
            }
        } else {
            throw new IllegalArgumentException("Not enough fuel.");
        }
    }

    @Override
    public double calculateRefillAmount() {
        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);
    }

    private boolean isEnoughFuel(int km) {
        return (super.getFuel() + extraFuel) - super.getFuelRate() * (km / 100D) >= 0;
    }
}