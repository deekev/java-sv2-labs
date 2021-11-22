package algorithmscount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    void testGetCountOfNumbers() {
        Digits digits = new Digits();
        int count = digits.getCountOfNumbers();

        assertEquals(9, count);
    }
}