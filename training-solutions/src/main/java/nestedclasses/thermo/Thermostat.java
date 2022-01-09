package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {

    private int temperatureLimit;
    private List<Thermometer> thermometers = new ArrayList<>();
    private List<String> roomsToHeat = new ArrayList<>();

    public Thermostat() {
        this.temperatureLimit = 23;
    }

    public void addThermometer(Thermometer thermometer) {
        thermometers.add(thermometer);
        thermometer.setThermometerObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                if (temp < temperatureLimit && !roomsToHeat.contains(room)) {
                    roomsToHeat.add(room);
                } else {
                    roomsToHeat.remove(room);
                }
            }
        });
    }

    public List<String> getRoomsToHeat() {
        return new ArrayList<>(roomsToHeat);
    }
}