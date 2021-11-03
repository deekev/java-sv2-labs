package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayInMonthTest {

    @Test
    void testGetNumberOfDaysInMonth() {
        DayInMonth dayInMonth = new DayInMonth();
        assertEquals(29, dayInMonth.getNumberOfDaysInMonth(2000, "FebruÁr"));
        assertEquals(29, dayInMonth.getNumberOfDaysInMonth(2020, "FebruÁr"));
        assertEquals(28, dayInMonth.getNumberOfDaysInMonth(2021, "FebruÁr"));
        assertEquals(31, dayInMonth.getNumberOfDaysInMonth(2021, "Január"));
        assertEquals(30, dayInMonth.getNumberOfDaysInMonth(2021, "ÁpriLis"));
        assertEquals(0, dayInMonth.getNumberOfDaysInMonth(2021, "Málius"));
    }
}