package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void testAddNote() {
        Student student = new Student();
        student.addNote(2);
        student.addNote(4);
        student.addNote(1);
        assertEquals(3, student.getNotes().size());
        assertEquals(4, student.getNotes().get(1));
    }

    @Test
    void testAddNoteException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Student().addNote(6));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}