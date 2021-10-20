package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Írj egy egész számot:");
            total += scanner.nextInt();
            System.out.println("Számaid összege: " + total);
            System.out.println();
        }
    }
}