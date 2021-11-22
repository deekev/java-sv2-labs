package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int min) {
        boolean contains = false;
        int i = 0;
        while (i < accounts.size() && !contains) {
            if (accounts.get(i).getBalance() > min) {
                contains = true;
            }
            i++;
        }
        return contains;
    }
}