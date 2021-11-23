package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testCreate() {
        Student student = new Student("Jack Doe", "3568 Péty, Kör út 0.");

        assertEquals("Jack Doe", student.getName());
        assertEquals("3568 Péty, Kör út 0.", student.getAddress());
    }
}