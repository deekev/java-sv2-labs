package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin(List<Integer> temperatures) {
        int minTemperature = temperatures.get(0);
        for (int actual: temperatures) {
            if (minTemperature > actual) {
                minTemperature = actual;
            }
        }
        return minTemperature;
    }
}