package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("A számológép használatahához adjon meg két egész számot:");

        System.out.println("Első:");
        int firstNumber = 0;
        try {
            firstNumber = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Nem számot adott meg!");
            System.out.println();
        }

        System.out.println("Második:");
        int secondNumber = 0;
        try {
            secondNumber = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Nem számot adott meg!");
            System.out.println();
        }

        System.out.println("Adja meg az elvégzendő művelet számát:");
        System.out.println("1.Összeadás");
        System.out.println("2.Kivonás");
        System.out.println("3.Szorzás");
        System.out.println("4.Osztás");

        String operation = sc.nextLine();
        try {
            switch (operation) {
                case "1":
                    System.out.println(firstNumber + secondNumber);
                    break;
                case "2":
                    System.out.println(firstNumber - secondNumber);
                    break;
                case "3":
                    System.out.println(firstNumber * secondNumber);
                    break;
                case "4":
                    System.out.println(firstNumber / secondNumber);
                    break;
                default:
                    System.out.println("Nincs ilyen művelet!");
            }
        }
        catch (ArithmeticException ae) {
            System.out.println("0-val való osztás nem lehetséges!");
        }
    }
}