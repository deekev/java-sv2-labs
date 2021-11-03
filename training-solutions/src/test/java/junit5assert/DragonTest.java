package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Süsü", 1, 2.53);
        String name = dragon.getName();
        assertEquals("Süsü", name);
        assertNotEquals("Lali", name);
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Lali", 7, 2.86);
        int heads = dragon.getNumberOfHeads();
        assertEquals(7, heads);
        assertTrue(heads == 7);
        assertFalse(heads < 7);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Pali", 3, 2.79);
        assertEquals(2.793, dragon.getHeight(), 0.005);
    }

    @Test
    void testNull() {
        Dragon dragon = new Dragon("Dani", 9, 3.11);
        Dragon anotherDragon = null;
        assertNull(anotherDragon);
        assertNotNull(dragon);
    }

    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("Bandi", 5, 2.74);
        Dragon anotherDragon = dragon;
        assertSame(dragon, anotherDragon);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon = new Dragon("Vali", 4, 2.36);
        Dragon anotherDragon = new Dragon("Vali", 4, 2.36);
        assertNotSame(dragon, anotherDragon);
    }
}