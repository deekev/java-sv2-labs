package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void testContainsLongerWord() {
        Word word = new Word();
        List<String> words = Arrays.asList("alma", "körte", "káposzta", "cseresznye");

        assertTrue(word.containsLongerWord(words, "macskafű"));
        assertTrue(word.containsLongerWord(words, "kutya"));
        assertFalse(word.containsLongerWord(words, "asztalterítő"));
    }
}