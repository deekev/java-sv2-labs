package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {

    static final List<SimpleTime> TIME_TABLE = Arrays.asList(
            new SimpleTime(9, 15),
            new SimpleTime(12, 45),
            new SimpleTime(14, 15),
            new SimpleTime(16, 15),
            new SimpleTime(18, 15)
    );

    @Test
    void constructorTestList() {
        BusTimeTable timetable = new BusTimeTable(TIME_TABLE);

        assertEquals(5, timetable.getTimeTable().size());
        assertEquals(9, timetable.getTimeTable().get(0).getHours());
        assertEquals(15, timetable.getTimeTable().get(4).getMinutes());
    }

    @Test
    void constructorTestHours() {
        BusTimeTable timetable = new BusTimeTable(14, 16, 30);

        assertEquals(3, timetable.getTimeTable().size());
        assertEquals(14, timetable.getTimeTable().get(0).getHours());
        assertEquals(30, timetable.getTimeTable().get(0).getMinutes());
        assertEquals(16, timetable.getTimeTable().get(2).getHours());
    }

    @Test
    void testNextBus() {
        BusTimeTable timetable = new BusTimeTable(TIME_TABLE);

        assertEquals("14:15", timetable.getNextBus(new SimpleTime(13, 15)).toString());
    }

    @Test
    void nextBusShouldThrowExceptionIfNone() throws IllegalStateException {
        BusTimeTable timetable = new BusTimeTable(TIME_TABLE);

        IllegalStateException ex = assertThrows(IllegalStateException.class, () -> {
            timetable.getNextBus(new SimpleTime(18, 16));
        });
        assertEquals("No more buses today!", ex.getMessage());
    }
}