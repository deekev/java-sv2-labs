package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your name:");
        String name = scanner.nextLine();

        System.out.println("Write your e-mail address:");
        String email = scanner.nextLine();

        System.out.println();
        System.out.println("You have successfully registered.");
        System.out.println("Name:" + " " + name);
        System.out.println("E-mail address:" + " " + email);
    }
}
