package exceptionclass.bank;

public class Account {

    private String accountNumber;
    private double balance;
    private double maxSubtract = 100_000;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number should not be null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract <= 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double amount) {
        if (amount <= 0 || amount > maxSubtract) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        if (amount > balance) {
            throw new LowBalanceBankOperationException("Low balance!");
        }
        balance -= amount;
        return balance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        balance += amount;
        return balance;
    }
}