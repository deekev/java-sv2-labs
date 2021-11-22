package algorithmscount.transactions;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactions, int maxAmount) {
        int count = 0;
        for (Transaction actual: transactions) {
            if (actual.isCredit() && actual.getAmount() < maxAmount) {
                count++;
            }
        }
        return count;
    }
}