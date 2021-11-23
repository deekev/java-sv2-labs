package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testCreate() {
        Person person = new Person("John Doe", 45, "3568 Péty, Kör út 0.");

        assertEquals("John Doe", person.getName());
        assertEquals(45, person.getAge());
        assertEquals("3568 Péty, Kör út 0.", person.getAddress());
    }
}