package stringconcat.employee;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Név:");
        String name = scanner.nextLine();
        System.out.println("Foglalkozás:");
        String job = scanner.nextLine();
        System.out.println("Fizetés:");
        int salary = scanner.nextInt();
        System.out.println();

        Employee employee = new Employee(name, job, salary);
        System.out.println(employee.toString());
    }
}