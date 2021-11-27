package staticattrmeth;

public class BankTransaction {

    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;

    private long transactionValue;

    public BankTransaction(long transactionValue) {
        if (transactionValue <= MIN_TRANSACTION_VALUE || transactionValue >= MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("Value of transaction must be between 1 and 10.000.000.");
        }
        countOfTransactions++;
        sumOfTransactions += transactionValue;
        if (transactionValue > currentMaxValue) {
            currentMaxValue = transactionValue;
        }
        if (countOfTransactions == 1 || currentMinValue > transactionValue) {
            currentMinValue = transactionValue;
        }
        this.transactionValue = transactionValue;
    }
    public long getTransactionValue() {
        return transactionValue;
    }
    public static void initTheDay() {
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMinValue = 0;
        currentMaxValue = 0;
    }
    public static long getAverageOfTransaction() {
        if (countOfTransactions != 0) {
            return Math.round((double) sumOfTransactions / countOfTransactions);
        }
        return 0;
    }
    public static long getCurrentMinValue() {
        return currentMinValue;
    }
    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }
    public static long getSumOfTransactions() {
        return sumOfTransactions;
    }
}