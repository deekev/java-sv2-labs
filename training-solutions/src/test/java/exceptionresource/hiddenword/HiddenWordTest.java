package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    HiddenWord hiddenWord = new HiddenWord();

    @Test
    void testGetHiddenWordWithRightPath() {

        Path path = Paths.get("src/test/resources/hiddenword.txt");
        String result = hiddenWord.getHiddenWord(path);

        assertEquals("ALMA KÖRTE", result);
    }

    @Test
    void testGetHiddenWordWithWrongtPath() {

        Path path = Paths.get("src/test/resources/hiddenword_txt");

        Exception exception = assertThrows(IllegalStateException.class, () -> hiddenWord.getHiddenWord(path));
        assertEquals("Can't read file.", exception.getMessage());
    }
}