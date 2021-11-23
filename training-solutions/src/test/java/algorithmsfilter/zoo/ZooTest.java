package algorithmsfilter.zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    List<Animal> animals = new ArrayList<>();
    Zoo zoo = new Zoo(animals);

    @BeforeEach
    void initList() {
        zoo.addAnimal(new Animal("zebra", 4));
        zoo.addAnimal(new Animal("kígyó", 0));
        zoo.addAnimal(new Animal("strucc", 2));
        zoo.addAnimal(new Animal("panda", 4));
        zoo.addAnimal(new Animal("pók", 8));
    }

    @Test
    void testAddAnimal() {
        zoo.addAnimal(new Animal("tigris", 4));

        assertEquals(6, animals.size());
        assertEquals("tigris", animals.get(5).getName());
        assertEquals(4, animals.get(5).getNumberOfLegs());
    }

    @Test
    void testGetAnimalsWithNumberOfLegsGiven() {
        List<Animal> result = zoo.getAnimalsWithNumberOfLegsGiven(4);

        assertEquals(2, result.size());
        assertEquals("panda", result.get(1).getName());
    }

    @Test
    void testGetAnimalsWithNumberOfLegsGivenWithInvalidNumber() {
        List<Animal> result = zoo.getAnimalsWithNumberOfLegsGiven(3);

        assertEquals(0, result.size());
    }
}