package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TankTest {

    @Test
    public void testModifyAngle() {
        Tank tank = new Tank();
        tank.modifyAngle(80);
        assertEquals(80, tank.getAngle());
        tank.modifyAngle(200);
        assertEquals(280, tank.getAngle());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionFirst() {
        new Tank().modifyAngle(81);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testExceptionSecond() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("A fordulás szöge nem eshet 80° és 280° közé!");
        new Tank().modifyAngle(461);
    }

    @Test
    public void testExceptionThird() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Tank().modifyAngle(279));
        assertEquals("A fordulás szöge nem eshet 80° és 280° közé!", exception.getMessage());
    }
}