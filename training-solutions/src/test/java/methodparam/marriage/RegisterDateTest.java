package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegisterDateTest {

    @Test
    void testCreate() {
        RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.of(1983, 10, 22));
        assertEquals("születés ideje", registerDate.getDescription());
        assertEquals("1983-10-22", registerDate.getDate().toString());
    }
}