package nestedclasses.thermo;

public class Thermometer {

    private String roomName;
    private int temperature;
    private ThermometerObserver thermometerObserver;

    public Thermometer(String roomName, int temperature) {
        this.roomName = roomName;
        this.temperature = temperature;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getTemperature() {
        return temperature;
    }

    public ThermometerObserver getThermometerObserver() {
        return thermometerObserver;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        onTemperatureChanged();
    }

    public void setThermometerObserver(ThermometerObserver observer) {
        this.thermometerObserver = observer;
        onTemperatureChanged();
    }

    public void onTemperatureChanged(){
        if (thermometerObserver != null) {
            thermometerObserver.handleTemperatureChange(temperature, roomName);
        }
    }


}
