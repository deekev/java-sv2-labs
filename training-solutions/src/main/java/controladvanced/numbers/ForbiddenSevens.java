package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot:");
        int number = sc.nextInt();

        while ((Integer.toString(number).contains("7") && number % 7 == 0) || !Integer.toString(number).contains("7")) {
            if (number % 7 == 0) {
                System.out.println("X");
                number++;
            } else {
                System.out.println(number);
                number++;
            }
        }
    }
}