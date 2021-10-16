package classstructureintegrate;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount (String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public int deposite(int inpayment) {
        return balance += inpayment;
    }

    public int withdraw(int withdrawal) {
        return balance -= withdrawal;
    }

    public String getInfo() {
        return owner + " (" + accountNumber + "): " + balance + " Ft";
    }
}
