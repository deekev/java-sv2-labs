package numbers;

public class Percent {

    public double getValue(int base, int percent) {
        return base * (percent / 100.0);
    }

    public double getBase(int value, int percent) {
        return value / (percent / 100D);
    }

    public double getPercent(int base, int value) {
        return ((double)value / base) * 100;
    }
}