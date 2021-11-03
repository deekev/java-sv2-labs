package controliteration.day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayTest {

    Day day;

    @BeforeEach
    void initDay() {
        day = new Day();
        day.addHour(new Hour(6));
        day.addHour(new Hour(7));
        day.addHour(new Hour(21));
        day.addHour(new Hour(22));
    }

    @Test
    void testSetDayPeriods () {
        day.setDayPeriod();
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(0).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(1).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(2).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(3).getPeriod());
    }
}