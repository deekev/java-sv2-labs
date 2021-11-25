package methodparam.sums;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    SeparatedSum separatedSum = new SeparatedSum();

    @Test
    void testReadText() {
        Path path = Paths.get("src/test/resources/floatingnumbers.txt");
        String result = new SeparatedSum().readText(path);

        assertEquals("12,8;25,7;-84,9;72,1;-52,8;-15,6", result);
    }

    @Test
    void testReadTextException() {
        Path path = Paths.get("src/test/resources/floatingnumberz.txt");

        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> new SeparatedSum().readText(path));
    }

    @Test
    void testSum() {
        Sum sum = separatedSum.sum("12,8;25,7;-84,9;72,1;-52,8;-15,6");

        assertEquals(110.6, sum.getPositiveSum(), 0.005);
        assertEquals(-153.3, sum.getNegativeSum(), 0.005);
    }
}