package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<>();

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Account list should not be null!");
        }
        this.accounts = accounts;
    }

    public void payment(String accountNumber, double amount) {
        int index = getIndexOfAccountNumber(accountNumber);
        if (index >= 0) {
            accounts.get(index).subtract(amount);
        } else {
            throw new InvalidAccountNumberBankOperationException("Invalid account number!");
        }
    }

    public void deposit(String accountNumber, double amount) {
        int index = getIndexOfAccountNumber(accountNumber);
        if (index >= 0) {
            accounts.get(index).deposit(amount);
        } else {
            throw new InvalidAccountNumberBankOperationException("Invalid account number!");
        }
    }

    private int getIndexOfAccountNumber(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accountNumber.equals(accounts.get(i).getAccountNumber())) {
                return i;
            }
        }
        return -1;
    }
}