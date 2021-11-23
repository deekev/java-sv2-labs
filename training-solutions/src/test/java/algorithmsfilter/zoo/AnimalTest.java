package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testCreate() {
        Animal animal = new Animal("zebra", 4);
        assertEquals("zebra", animal.getName());
        assertEquals(4, animal.getNumberOfLegs());
    }
}