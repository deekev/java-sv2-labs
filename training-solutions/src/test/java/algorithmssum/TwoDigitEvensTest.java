package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDigitEvensTest {

    @Test
    void testGetSum() {
        TwoDigitEvens twoDigitEvens = new TwoDigitEvens();
        int sum = twoDigitEvens.getSum();
        assertEquals(1980, sum);
    }
}