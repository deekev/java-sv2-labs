package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Számlaműveletekhez adja meg adatait:");
        System.out.println("Bankszámlaszám:");
        String accountNumber = scanner.nextLine();
        System.out.println();

        System.out.println("Számlatulajdonos neve:");
        String owner = scanner.nextLine();
        System.out.println();

        System.out.println("Számla egyenlege:");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);

        System.out.println("Sikeres azonosítás.");
        System.out.println();
        System.out.println("Amennyiben pénzt szeretne felvenni, adja meg az összeget:");
        bankAccount.withdraw(scanner.nextInt());
        scanner.nextLine();
        System.out.println();

        System.out.println("Amennyiben pénzt szeretne befizetni, adja meg az összeget:");
        bankAccount.deposite(scanner.nextInt());
        scanner.nextLine();
        System.out.println();

        System.out.println("Tranzakció sikeres.");
        System.out.println();
        System.out.println("Az Ön új egyenlege:");
        System.out.println(bankAccount.getInfo());
    }
}
