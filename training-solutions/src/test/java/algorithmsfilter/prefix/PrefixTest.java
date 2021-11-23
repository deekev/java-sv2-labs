package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void testGetWordsStartWith() {
        List<String> words = Arrays.asList("macska", "kutya", "majom", "tigris", "malac", "zsiráf", "vidra");
        Prefix prefix = new Prefix();

        assertEquals(3, prefix.getWordsStartWith(words, "ma").size());
        assertEquals("macska", prefix.getWordsStartWith(words, "ma").get(0));

        assertEquals(0, prefix.getWordsStartWith(words, "ze").size());
    }
}