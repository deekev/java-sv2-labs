package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String getFullName(String last, String first) {
        return last + " " + first;
    }

    public LocalDate getBirthDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Regisztrációhoz adja meg az adatokat.");
        System.out.println("Vezetéknév: ");
        String lastName = scanner.nextLine();
        System.out.println("Keresztnév: ");
        String firstName = scanner.nextLine();
        System.out.println("Születés éve: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Születés hónapja: ");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Születés napja: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("E-mail cím: ");
        String email = scanner.nextLine();
        System.out.println();

        Registration registration = new Registration();
        Person person = new Person(registration.getFullName(lastName, firstName), registration.getBirthDate(year, month, day), email);
        System.out.println("Sikeres regisztráció.");
        System.out.println(person.toString());
    }
}