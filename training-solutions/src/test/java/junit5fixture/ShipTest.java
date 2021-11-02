package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {

    Ship ship;

    @BeforeEach
    void initShip() {
        ship = new Ship("Titanic", 1911, 268.89);
    }

    @Test
    void testName() {
        assertEquals("Titanic", ship.getName());
        assertNotEquals("Poseidon", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1911, ship.getYearOfConstruction());
        assertTrue(1911 == ship.getYearOfConstruction());
        assertFalse(1919 == ship.getYearOfConstruction());
    }

    @Test
    void testLength() {
        assertEquals(268.891, ship.getLength(), 0.005);
    }

    @Test
    void testNull() {
        Ship anotherShip = null;
        assertNull(anotherShip);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
        Ship anotherShip = ship;
        assertSame(ship, anotherShip);
    }

    @Test
    void testNotSameObjects() {
        Ship anotherShip = new Ship("Titanic", 1911, 268.89);
        assertNotSame(ship, anotherShip);
    }
}
