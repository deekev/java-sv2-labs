package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {

    private int cargoWeight;
    private final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        int residual = 0;
        if (maxCargoWeight >= cargoWeight) {
            this.cargoWeight = cargoWeight;
        } else {
            this.cargoWeight = maxCargoWeight;
            residual = cargoWeight - maxCargoWeight;
        }
        return residual;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}