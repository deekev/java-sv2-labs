package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words words = new Words();

    @Test
    void testGetFirstWordWithAWithListContainsWordWithA() {
        String result = words.getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("Anna", result);
    }

    @Test
    void testGetFirstWordWithAWithListNotContainsWordWithA() {
        String result = words.getFirstWordWithA(Paths.get("src/test/resources/words2.txt"));
        assertEquals("A", result);
    }

    @Test
    void testGetFirstWordWithAException() {
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> new Words().getFirstWordWithA(Paths.get("src/test/resources/words2_txt")));
        assertEquals("Can not read file", exception.getMessage());
    }
}