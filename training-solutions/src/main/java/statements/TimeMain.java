package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy időpontot.");
        System.out.println("Óra (0-24):");
        int firstHour = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Perc (0-60):");
        int firstMinute = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Másodperc (0-60):");
        int firstSecond = scanner.nextInt();
        scanner.nextLine();

        Time firstTime = new Time(firstHour, firstMinute, firstSecond);

        System.out.println("Az első időpont " + firstTime.toString() + " = " + firstTime.getInMinutes() + " perc.");
        System.out.println();

        System.out.println("Adj meg egy újabb időpontot.");
        System.out.println("Óra (0-24):");
        int secondHour = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Perc (0-60):");
        int secondMinute = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Másodperc (0-60):");
        int secondSecond = scanner.nextInt();
        scanner.nextLine();

        Time secondTime = new Time(secondHour, secondMinute, secondSecond);

        System.out.println("A második időpont " + secondTime.toString() + " = " + secondTime.getInSeconds() + " másodperc.");
        System.out.println();

        System.out.println("Az első korábbi mint a második: " + firstTime.earlierThan(secondTime));

    }
}