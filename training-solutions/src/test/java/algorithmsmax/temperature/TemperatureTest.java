package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void testGetMin() {
        Temperature temperature = new Temperature();
        List<Integer> temperatures = Arrays.asList(3, 5, 2, -4, -6, -3, -6, -1, 3, 5, 7);
        int minTemperature = temperature.getMin(temperatures);

        assertEquals(-6, minTemperature);
    }
}