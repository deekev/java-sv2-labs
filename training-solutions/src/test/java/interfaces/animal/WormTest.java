package interfaces.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WormTest {

    @Test
    void testGetNumberofLegs() {
        Worm worm = new Worm();

        assertEquals(0, worm.getNumberOfLegs());
    }

    @Test
    void testGetName() {
        Worm worm = new Worm();

        assertEquals("Worm", worm.getName());
    }
}