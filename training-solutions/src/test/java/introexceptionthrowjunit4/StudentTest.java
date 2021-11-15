package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class StudentTest {

    @Test
    public void testAddNote() {
        Student student = new Student();
        student.addNote(5);
        student.addNote(3);
        assertEquals(2, student.getNotes().size());
        assertEquals(Integer.valueOf(5), student.getNotes().get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionFirst() {
        new Student().addNote(6);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testExceptionSecond() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Note must be between 1 and 5!");
        new Student().addNote(0);
    }

    @Test
    public void testExceptionThird() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Student().addNote(6));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}