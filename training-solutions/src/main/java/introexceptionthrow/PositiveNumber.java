package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot:");
        String number = scanner.nextLine();
        char[] characters = number.toCharArray();

        for (char actual: characters) {
            if (!Character.isDigit(actual)) {
                throw new IllegalArgumentException("Hibás adat:" + number);
            }
        }

        System.out.println(Integer.parseInt(number));
    }
}