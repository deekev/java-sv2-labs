package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void testIsPrime() {
        Prime prime = new Prime();
        assertTrue(prime.isPrime(13));
        assertTrue(prime.isPrime(2));
        assertTrue(prime.isPrime(4691));
        assertTrue(prime.isPrime(9631));
        assertFalse(prime.isPrime(4));
        assertFalse(prime.isPrime(9999));
        assertFalse(prime.isPrime(555));
        assertFalse(prime.isPrime(124));
    }
}