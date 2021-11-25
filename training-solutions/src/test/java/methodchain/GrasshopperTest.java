package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    @Test
    void testHopOnce() {
        Grasshopper grasshopper = new Grasshopper();

        assertEquals(0, grasshopper.getPosition());

        grasshopper.hopOnce(Direction.POSITIVE);
        grasshopper.hopOnce(Direction.NEGATIVE);
        grasshopper.hopOnce(Direction.NEGATIVE);

        assertEquals(-1, grasshopper.getPosition());
    }

    @Test
    void testMoveFromZeroToThreeWithFiveHops() {
        Grasshopper grasshopper = new Grasshopper();
        grasshopper.moveFromZeroToThreeWithFiveHops();

        assertEquals(3, grasshopper.getPosition());
    }
}