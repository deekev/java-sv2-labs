package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Befektetés összege:");
        int invest = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kamatláb:");
        int interestRate = scanner.nextInt();
        scanner.nextLine();

        Investment investment = new Investment(invest, interestRate);
        System.out.println("Tőke: " + investment.getFund());

        double interest = investment.getYield(50);
        System.out.println("Hozam 50 napra: " + interest);

        double close = investment.close(80);
        System.out.println("Kivett összeg 80 nap után: " + close);

        double secondClose = investment.close(90);
        System.out.println("Kivett összeg 90 nap után: " + secondClose);
    }
}
