package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToConsonantTest {

    @Test
    void testReturnConsonant() {
        ToConsonant toConsonant = new ToConsonant();
        assertEquals('b', toConsonant.returnConsonant('a'));
        assertEquals('f', toConsonant.returnConsonant('e'));
        assertEquals('j', toConsonant.returnConsonant('i'));
        assertEquals('p', toConsonant.returnConsonant('o'));
        assertEquals('v', toConsonant.returnConsonant('u'));
        assertEquals('s', toConsonant.returnConsonant('s'));
        assertEquals('g', toConsonant.returnConsonant('g'));
    }
}