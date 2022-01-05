package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    Siblings siblings = new Siblings();

    @Test
    void testGetFullNamesWithRightParameters() {

        Path path = Paths.get("src/test/resources/siblings.txt");
        List<String> result = siblings.getFullNames("Sün", path);

        assertEquals(7, result.size());
        assertEquals("Sün Balázs", result.get(6));
    }

    @Test
    void testGetFullNamesWithWrongPath() {

        Path path = Paths.get("src/test/resources/siblings_txt");

        Exception exception = assertThrows(IllegalStateException.class, () -> siblings.getFullNames("Sün", path));
        assertEquals("Can not read file", exception.getMessage());
    }

    @Test
    void testGetFullNamesWithEmptyLastName() {

        Path path = Paths.get("src/test/resources/siblings.txt");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> siblings.getFullNames("", path));
        assertEquals("Last name can't be empty.", exception.getMessage());
    }

    @Test
    void testGetFullNamesWithNull() {
        Path path = Paths.get("src/test/resources/siblings.txt");

        Exception exception = assertThrows(NullPointerException.class, () -> siblings.getFullNames(null, path));
        assertEquals("Last name is null.", exception.getMessage());
    }
}