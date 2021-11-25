package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    Marriage marriage = new Marriage();

    @Test
    void testGetMarried() {
        Woman woman = new Woman("Tóth Katalin");
        Man man = new Man("Hegyi Péter");
        marriage.getMarried(woman, man);

        assertEquals(1, woman.getRegisterDates().size());
        assertEquals("Hegyi Katalin", woman.getName());
        assertEquals("házasságkötés ideje", woman.getRegisterDates().get(0).getDescription());
        assertEquals(LocalDate.now(), man.getRegisterDates().get(0).getDate());
    }
}