package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TankTest {

    @Test
    void testModifyAngle() {
        Tank tank = new Tank();
        tank.modifyAngle(80);
        assertEquals(80, tank.getAngle());
        tank.modifyAngle(-120);
        assertEquals(320, tank.getAngle());
    }

    @Test
    void testModifyAngleException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Tank().modifyAngle(197));
        assertEquals("A fordulás szöge nem eshet 80° és 280° közé!", exception.getMessage());
    }
}