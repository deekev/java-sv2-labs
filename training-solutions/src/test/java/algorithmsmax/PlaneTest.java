package algorithmsmax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void testGetLongestOcean() {
        Plane plane = new Plane();
        String map = "1000000011111000000000000111111111100001000001000010000011111111" +
                "0000101000000000111110000000000000000100000001000000000000111111000000000100000000000011";
        int longestOcean = plane.getLongestOcean(map);

        assertEquals(16, longestOcean);
    }
}