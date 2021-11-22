package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int sumCreditEntries = 0;
        for (Transaction actual: transactions) {
            if (actual.isCredit()) {
                sumCreditEntries += actual.getAmount();
            }
        }
        return sumCreditEntries;
    }
}