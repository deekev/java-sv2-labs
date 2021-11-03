package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsTest {

    Words words;

    @BeforeEach
    void initWords() {
        words = new Words();
        words.addWord("kutya");
        words.addWord("macska");
        words.addWord("malom");
        words.addWord("tigris");
        words.addWord("majomkenyér");
        words.addWord("tintatartó");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> wordsStartPrefix = Arrays.asList("macska", "malom", "majomkenyér");
        words.getWordsStartWith("ma");
        assertEquals(wordsStartPrefix, words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> wordsWithRightLength = Arrays.asList("macska", "tigris");
        words.getWordsWithLength(6);
        assertEquals(wordsWithRightLength, words.getWords());
    }
}