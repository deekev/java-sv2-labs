package numbers;

import java.util.Scanner;

public class PercentMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg 3 számot:");
        int base = scanner.nextInt();
        scanner.nextLine();
        int value = scanner.nextInt();
        scanner.nextLine();
        int percent = scanner.nextInt();
        scanner.nextLine();

        System.out.println(base + "-nak a " + percent + "%-a " + new Percent().getValue(base,percent));
        System.out.println(value + " a " + percent + "%-a "+ new Percent().getBase(value, percent) + "-nak" );
        System.out.println(value + " a " + base + "-nak a " + new Percent().getPercent(base, value) + "%-a");
    }
}