package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("A számológép használatához adjon meg két egész számot");

        System.out.println("Első:");
        int firstNumber = 0;
        try {
            firstNumber = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Nem számot adott meg!");
            System.out.println();
        }

        System.out.println("Második:");
        int secondNumber = 0;
        try {
            secondNumber = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Nem számot adott meg!");
            System.out.println();
        }

        StringBuilder stringBuilder = new StringBuilder("Adja meg a választott művelet számát:\n");
        stringBuilder.append("1.Összeadás\n")
                .append("2.Kivonás\n")
                .append("3.Szorzás\n")
                .append("4.Osztás\n");
        System.out.println(stringBuilder);

        String operation = scanner.nextLine();
        switch (operation) {
            case "1":
                System.out.println(new Calculator().addNumbers(firstNumber, secondNumber));
                break;
            case "2":
                System.out.println(new Calculator().extractNumbers(firstNumber, secondNumber));
                break;
            case "3":
                System.out.println(new Calculator().multiplyNumbers(firstNumber, secondNumber));
                break;
            case "4":
                try {
                    System.out.println(new Calculator().divideNumbers(firstNumber, secondNumber));
                    break;
                }
                catch (ArithmeticException ae) {
                    System.out.println("0-val való osztás nem lehetséges!");
                    break;
                }
            default:
                System.out.println("Nincs ilyen művelet!");
        }
    }
}