package initializer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void testConstructorW3Parameters() {
        CreditCard card = new CreditCard(1000, Currency.EUR);

        assertEquals(308_230L, card.getBalance());
    }

    @Test
    void testConstructorW1Parameter() {
        CreditCard card = new CreditCard(100_000);

        assertEquals(100_000L, card.getBalance());
    }

    @Test
    void testPaymentW2ParametersSuccess() {
        CreditCard card = new CreditCard(100_000);

        assertTrue(card.payment(100, Currency.EUR));
        assertEquals(69177L, card.getBalance());
    }

    @Test
    void testPaymentW2ParametersFail() {
        CreditCard card = new CreditCard(100_000);

        assertFalse(card.payment(1000, Currency.EUR));
        assertEquals(100_000L, card.getBalance());
    }

    @Test
    void testPaymentW1ParameterSuccess() {
        CreditCard card = new CreditCard(100_000);

        assertTrue(card.payment(10_000));
        assertEquals(90_000L, card.getBalance());
    }

    @Test
    void testPaymentW1ParameterFail() {
        CreditCard card = new CreditCard(100_000);

        assertFalse(card.payment(150_000));
        assertEquals(100_000L, card.getBalance());
    }
}