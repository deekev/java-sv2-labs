package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void testGetFirstTwoLetters() {
        TwoLetters twoLetters = new TwoLetters();
        List<String> words = Arrays.asList("macska", "barack", "alma", "kutya", "szőllő", "egér");
        List<String> result = twoLetters.getFirstTwoLetters(words);

        assertEquals(6, result.size());
        assertEquals("ba", result.get(1));
        assertEquals("eg", result.get(5));
    }
}