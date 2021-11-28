package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    @Test
    void constructorTest2Parameters() {
        SimpleTime time = new SimpleTime(15, 16);

        assertEquals(15, time.getHours());
        assertEquals(16, time.getMinutes());
    }

    @Test
    void constructorTest1Parameter() {
        SimpleTime time = new SimpleTime(15);

        assertEquals(15, time.getHours());
        assertEquals(0, time.getMinutes());
    }

    @Test
    void constructorTestSimpleTimeParameter() {
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));

        assertEquals(15, time.getHours());
        assertEquals(16, time.getMinutes());
    }

    @Test
    void differenceAfter() {
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        SimpleTime anotherTime = new SimpleTime(new SimpleTime(14, 10));

        assertEquals(66, time.getDifference(anotherTime));
    }

    @Test
    void differenceIfEqual() {
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        SimpleTime anotherTime = new SimpleTime(new SimpleTime(15, 16));

        assertEquals(0, time.getDifference(anotherTime));
    }

    @Test
    void differenceEarlier() {
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        SimpleTime anotherTime = new SimpleTime(new SimpleTime(17, 26));

        assertEquals(-130, time.getDifference(anotherTime));
    }

    @Test
    void toStringTest() {
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));

        assertEquals("15:16", time.toString());
    }
}