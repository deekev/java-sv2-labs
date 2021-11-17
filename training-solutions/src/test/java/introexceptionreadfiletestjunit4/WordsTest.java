package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class WordsTest {

    private Words words = new Words();

    @Test
    public void testGetFirstWordWithAWithListContainsWordWithA() {
        Path path = Paths.get("src/test/resources/words.txt");
        String result = words.getFirstWordWithA(path);
        assertEquals("Anna", result);
    }

    @Test
    public void testGetFirstWordWithAWithListNotContainsWordWithA() {
        Path path = Paths.get("src/test/resources/words2.txt");
        String result = words.getFirstWordWithA(path);
        assertEquals("A", result);
    }

    @Test
    public void testGetFirstWordWithAException() {
        Path path = Paths.get("src/test/resources/words_txt");
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(path));
        assertEquals("Can not read file", exception.getMessage());
    }
}