package classstructuremethods;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Please authenticate yourself first.");
        System.out.println();

        System.out.println("Name:");
        client.setName(scanner.nextLine());

        System.out.println("Year of birth:");
        client.setYearOfBirth(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Former address:");
        client.setAddress(scanner.nextLine());

        System.out.println();
        System.out.println("Please check your personal details:");
        System.out.println("Name: " + client.getName());
        System.out.println("Year of birth: " + client.getYearOfBirth());
        System.out.println("Former address:" + client.getAddress());
        System.out.println();

        System.out.println("Please write your new address:");
        client.migrate(scanner.nextLine());

        System.out.println();
        System.out.println("Your address is successfully changed:");
        System.out.println("New address: " + client.getAddress());

    }
}
