package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {

    @Test
    void testAddRegisterDate() {
        Woman woman = new Woman("Jane Doe");
        woman.addRegisterDate(new RegisterDate("születés ideje", LocalDate.of(1983, 10, 22)));
        woman.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.of(2009, 7, 20)));

        assertEquals(2, woman.getRegisterDates().size());
        assertEquals("születés ideje", woman.getRegisterDates().get(0).getDescription());
        assertEquals("2009-07-20", woman.getRegisterDates().get(1).getDate().toString());
    }
}