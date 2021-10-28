package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg az alábbi feladat eredményét (4 tizedes pontossággal): ");
        System.out.println("3 * (6 - 4) + 5 / 3");
        double result = scanner.nextDouble();

        if(Math.abs((3 * (6 - 4) + 5 / 3D) - result) < 0.0001)  {
            System.out.println("Az eredmény helyes.");
        } else {
            System.out.println("Az eredmény helytelen.");
        }
    }
}