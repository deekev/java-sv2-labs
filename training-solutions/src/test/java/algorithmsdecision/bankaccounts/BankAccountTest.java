package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testCreate() {
        BankAccount bankAccount = new BankAccount("Fred", "123-324-123", 100);
        assertEquals("Fred", bankAccount.getNameOfOwner());
        assertEquals("123-324-123", bankAccount.getAccountNumber());
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount bankAccount = new BankAccount("Kate", "133-324-123", 200);
        bankAccount.withdraw(50);
        bankAccount.withdraw(20);
        assertEquals(130, bankAccount.getBalance());
    }

    void testDeposit() {
        BankAccount bankAccount = new BankAccount("Kate", "133-324-123", 200);
        bankAccount.deposit(50);
        bankAccount.deposit(20);
        assertEquals(270, bankAccount.getBalance());
    }
}