package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number:");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Write another number:");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        System.out.println("Your numbers are:");
        System.out.println("" + firstNumber + " + " + secondNumber);
        System.out.println(firstNumber + secondNumber);
    }
}
