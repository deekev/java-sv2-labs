package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Záróvizsgára jelentkezéshez adja meg az adatait.");
        System.out.println("Név: ");
        String name = scanner.nextLine();

        System.out.println("Születési idő \"éééé-hh-nn\" formában: ");
        String birthInString = scanner.nextLine();
        LocalDate birth = LocalDate.parse(birthInString);

        System.out.println("Irányítószám: ");
        String zipCodeInString = scanner.nextLine();
        int zipCode = Integer.parseInt(zipCodeInString);

        System.out.println("Tanulmányi átlag: ");
        String averageInString = scanner.nextLine();
        double average = Double.parseDouble(averageInString);
        System.out.println();

        Person person = new Person(name, birth, zipCode, average);
        System.out.println("Regisztrált adatok:");
        System.out.println(person.toString());
        System.out.println();

        Exam exam = new Exam();
        exam.addPerson(person);
        System.out.println(exam.getPersons());
    }
}