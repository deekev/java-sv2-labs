package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumbersTest {

    @Test
    void testGetEvenNumbers() {
        Numbers numbers = new Numbers();
        int[] numbersToTest = {4, 3, 5, 6, 2, 7};
        int[] numbersExpected = {4, 0, 0, 6, 2, 0};
        assertArrayEquals(numbersExpected, numbers.getEvenNumbers(numbersToTest));
    }
}