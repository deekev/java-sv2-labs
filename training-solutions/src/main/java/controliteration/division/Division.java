package controliteration.division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divisor = scanner.nextInt();
        scanner.nextLine();

        for (int i = divisor; i < number; i += divisor) {
            System.out.print(i + ", ");
        }
        System.out.println();

        int count = divisor;
        while (count < number) {
            System.out.print(count + ", ");
            count += divisor;
        }
    }
}