package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Születés éve: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Születés hónapja számmal megadva: ");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Születés napja: ");
        int day = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Név: ");
        String name = scanner.nextLine();

        Employee employee = new Employee(year, month, day, name);

        System.out.println("Név: " + employee.getName());
        System.out.println("Születési idő: " + employee.getDateOfBirth());
        System.out.println("Belépés ideje: " + employee.getBeginEmployment());
    }
}
