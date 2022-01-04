package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum numbersSum = new NumbersSum();

    @Test
    void testGetSumWithNumberArray() {
        int result = numbersSum.getSum(new int[] {15, 30, 45, 60});

        assertEquals(150, result);
    }

    @Test
    void testGetSumWithNumberArrayNull() {
        int[] numbers = null;

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> numbersSum.getSum(numbers));
        assertEquals("Array is null!", exception.getMessage());
    }

    @Test
    void testGetSumWithStringArray() {
        int result = numbersSum.getSum(new String[] {"15", "30", "45", "60"});

        assertEquals(150, result);
    }

    @Test
    void testGetSumWithStringArrayNull() {
        String[] numbers = null;

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> numbersSum.getSum(numbers));
        assertEquals("Array is null!", exception.getMessage());
    }

    @Test
    void testGetSumWithInvalidNumber() {
        String[] numbers = new String[] {"15", "30", "45", "6o"};

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> numbersSum.getSum(numbers));
        assertEquals("Invalid number", exception.getMessage());
        assertEquals(NumberFormatException.class, exception.getCause().getClass());
    }
}