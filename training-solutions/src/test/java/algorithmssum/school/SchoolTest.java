package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void testGetNumberOfStudents() {
        School school = new School();
        List<Integer> headcounts = Arrays.asList(28, 32, 25, 27, 33, 25);
        assertEquals(170, school.getNumberOfStudents(headcounts));
    }
}