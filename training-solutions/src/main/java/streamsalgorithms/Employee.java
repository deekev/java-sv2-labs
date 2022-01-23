package streamsalgorithms;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nagy Nóra", 1986));
        employees.add(new Employee("Kiss Péter", 1978));
        employees.add(new Employee("Gál Tamás", 2003));
        employees.add(new Employee("Tóth Emese", 1998));
        employees.add(new Employee("Sütő András", 1969));
        employees.add(new Employee("Török Katalin", 1990));
        employees.add(new Employee("Szép Balázs", 1985));
        employees.add(new Employee("Horváth Dénes", 1996));

        int sumOfYears = employees
                .stream()
                .mapToInt(employee -> employee.yearOfBirth)
                .sum();
        System.out.println(sumOfYears);


        int sumAges = employees
                .stream()
                .mapToInt(employee -> LocalDate.now().getYear() - employee.yearOfBirth)
                .sum();
        System.out.println(sumAges);


        long numberOfEmployees = employees
                .stream()
                .count();
        System.out.println(numberOfEmployees);


        long numberOfEmployeesBornBefore1990 = employees
                .stream()
                .filter(employee -> employee.yearOfBirth < 1990)
                .count();
        System.out.println(numberOfEmployeesBornBefore1990);


        int earliestYearOfBirth = employees
                .stream()
                .mapToInt(employee -> employee.yearOfBirth)
                .min()
                .orElseThrow(() -> new IllegalArgumentException("Empty."));
        System.out.println(earliestYearOfBirth);


        String nameOfEmployeeBornFirst = employees
                .stream()
                .sorted(Comparator.comparingInt(o -> o.yearOfBirth))
                .map(employee -> employee.name)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Empty."));
        System.out.println(nameOfEmployeeBornFirst);


        boolean wasAllEmployeeBorneBefore1980 = employees
                .stream()
                .allMatch(employee -> employee.yearOfBirth < 1980);
        System.out.println(wasAllEmployeeBorneBefore1980);


        List<Employee> employeesBornBefore1990 = employees
                .stream()
                .filter(employee -> employee.yearOfBirth < 1990)
                .collect(Collectors.toList());
        System.out.println(employeesBornBefore1990);


        List<String> employeesNames = employees
                .stream()
                .map(employee -> employee.name)
                .collect(Collectors.toList());
        System.out.println(employeesNames);


        List<String> employeesNamesBornBefore1990 = employees
                .stream()
                .filter(employee -> employee.yearOfBirth < 1990)
                .map(employee -> employee.name)
                .collect(Collectors.toList());
        System.out.println(employeesNamesBornBefore1990);
    }
}