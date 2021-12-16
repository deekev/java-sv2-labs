package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> ships = new ArrayList<>();
    private int waitingPeople;
    private int waitingCargo;

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void loadShip(int passengers, int cargoWeight) {
        for (Ship actual: ships) {
            if (actual instanceof Liner) {
                passengers = ((Liner) actual).loadPassenger(passengers);
            } else if (actual instanceof CargoShip) {
                cargoWeight = ((CargoShip) actual).loadCargo(cargoWeight);
            } else if (actual instanceof FerryBoat) {
                passengers = ((FerryBoat) actual).loadPassenger(passengers);
                cargoWeight = ((FerryBoat) actual).loadCargo(cargoWeight);
            }
        }
        waitingPeople = passengers;
        waitingCargo = cargoWeight;
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}