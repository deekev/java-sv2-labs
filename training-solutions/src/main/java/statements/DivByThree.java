package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Írj be egy egész számot:");
        int number = scanner.nextInt();

        boolean isDivByThree = number % 3 == 0;

        System.out.println("A megadott szám osztható 3-mal: " + isDivByThree);
    }
}
