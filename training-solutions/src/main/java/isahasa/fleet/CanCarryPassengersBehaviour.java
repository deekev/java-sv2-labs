package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {

    private int passengers;
    private final int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        int residual = 0;
        if (maxPassengers >= passengers) {
            this.passengers = passengers;
        } else {
            this.passengers = maxPassengers;
            residual = passengers - maxPassengers;
        }
        return residual;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}