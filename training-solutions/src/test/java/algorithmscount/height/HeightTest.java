package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void testCountChildrenWithHeightGreaterThan() {
        Height height = new Height();
        List<Integer> heights = Arrays.asList(145, 151, 163, 169, 159, 161, 155, 160, 167, 170);

        int count = height.countChildrenWithHeightGreaterThan(heights, 160);

        assertEquals(5, count);
    }
}