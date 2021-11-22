package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan (List<BankAccount> bankAccounts, int minBalance) {
        int count = 0;
        for (BankAccount actual: bankAccounts) {
            if (actual.getBalance() > minBalance) {
                count++;
            }
        }
        return count;
    }
}