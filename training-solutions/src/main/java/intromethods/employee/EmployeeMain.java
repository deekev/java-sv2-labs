package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", 2018, 300_000);
        System.out.println(employee);
        System.out.println();

        employee.setName("Jane Doe");
        employee.raiseSalary(50_000);
        System.out.println(employee);
    }
}