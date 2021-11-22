package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void testGetMax() {
        Hill hill = new Hill();
        List<Integer> heights = Arrays.asList(7841, 1936, 2874, 6536, 5937, 5578, 7842, 1094, 3368);
        int maxHeight = hill.getMax(heights);

        assertEquals(7842, maxHeight);
    }
}