package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void testCreate() {
        Time time = new Time(13, 14, 15);

        assertEquals(13, time.getHours());
        assertEquals(14, time.getMinutes());
        assertEquals(15, time.getSeconds());
    }

    @Test
    void testIsEqualWithIntParameters() {
        Time time = new Time(13, 14, 15);

        assertTrue(time.isEqual(13, 14, 15));
        assertFalse(time.isEqual(15, 10, 10));
    }

    @Test
    void testIsEqualWithTimeParameter() {
        Time time = new Time(13, 14, 15);
        Time firstAnotherTime = new Time(13, 14, 15);
        Time secondAnotherTime = new Time(11, 12, 13);

        assertTrue(time.isEqual(firstAnotherTime));
        assertFalse(time.isEqual(secondAnotherTime));
    }

    @Test
    void testIsEarlierWithIntParameters() {
        Time time = new Time(13, 14, 15);

        assertTrue(time.isEarlier(15, 10, 10));
        assertFalse(time.isEarlier(10, 10, 10));
    }

    @Test
    void testIsEarlierWithTimeParameter() {
        Time time = new Time(13, 14, 15);
        Time firstAnotherTime = new Time(13, 14, 15);
        Time secondAnotherTime = new Time(15, 16, 17);
        Time thirdAnothertime = new Time(11, 12, 13);

        assertFalse(time.isEarlier(firstAnotherTime));
        assertTrue(time.isEarlier(secondAnotherTime));
        assertFalse(time.isEarlier(thirdAnothertime));
    }
}