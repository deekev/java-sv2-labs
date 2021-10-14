package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your name:");
        client.name = scanner.nextLine();

        System.out.println("Please write the year of your birth:");
        client.yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please write your address:");
        client.address = scanner.nextLine();

        System.out.println();
        System.out.println("Your client profile:");
        System.out.println("Name:" + "" + client.name);
        System.out.println("Year of birth:" + client.yearOfBirth);
        System.out.println("Address:" + client.address);


    }
}
