package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOfWeeksTest {

    @Test
    void testGetTypeOfDay() {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        assertEquals("hét eleje", dayOfWeeks.getTypeOfDay("HéTfő"));
        assertEquals("hét közepe", dayOfWeeks.getTypeOfDay("csüTÖrtök"));
        assertEquals("majdnem hétvége", dayOfWeeks.getTypeOfDay("pénteK"));
        assertEquals("hét vége", dayOfWeeks.getTypeOfDay("Vasárnap"));
        assertEquals("ismeretlen nap", dayOfWeeks.getTypeOfDay("szomat"));
    }
}