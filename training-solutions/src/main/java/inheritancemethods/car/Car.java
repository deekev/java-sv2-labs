package inheritancemethods.car;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        if (tankCapacity < fuel) {
            throw new IllegalArgumentException("Not enough tank capacity.");
        }
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        if (tankCapacity - (this.fuel + fuel) < 0) {
            throw new IllegalArgumentException("Not enough tank capacity.");
        } else {
            this.fuel += fuel;
        }
    }

    public void drive(int km) {
        if (isEnoughFuel(km)) {
            this.fuel -= fuelRate * (km / 100D);
        } else {
            throw new IllegalArgumentException("Not enough fuel.");
        }
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

    private boolean isEnoughFuel(int km) {
        return fuel - fuelRate * (km / 100D) >= 0;
    }
}