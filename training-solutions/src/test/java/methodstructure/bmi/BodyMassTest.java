package methodstructure.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    @Test
    void testCreate() {
        BodyMass bodyMass = new BodyMass(58.6, 1.64);

        assertEquals(58.6, bodyMass.getWeight(), 0.005);
        assertEquals(1.64, bodyMass.getHeight(), 0.005);
    }

    @Test
    void testGetBodyMassIndex() {
        BodyMass bodyMass = new BodyMass(60, 1.7);
        double bmi = bodyMass.getBodyMassIndex();

        assertEquals(20.76, bmi, 0.005);
    }

    @Test
    void testGetBodyNormal() {
        BodyMass bodyMass = new BodyMass(60, 1.7);
        BmiCategory category = bodyMass.getBody();

        assertEquals(BmiCategory.NORMAL, category);
    }

    @Test
    void testGetBodyUnderweight() {
        BodyMass bodyMass = new BodyMass(50, 1.9);
        BmiCategory category = bodyMass.getBody();

        assertEquals(BmiCategory.UNDERWEIGHT, category);
    }

    @Test
    void testGetBodyOwerweight() {
        BodyMass bodyMass = new BodyMass(80, 1.65);
        BmiCategory category = bodyMass.getBody();

        assertEquals(BmiCategory.OVERWEIGHT, category);
    }

    @Test
    void testIsThinnerThan() {
        BodyMass bodyMass = new BodyMass(60, 1.7);
        BodyMass other = new BodyMass(80, 1.65);

        assertTrue(bodyMass.isThinnerThan(other));
        assertFalse(other.isThinnerThan(bodyMass));
    }
}