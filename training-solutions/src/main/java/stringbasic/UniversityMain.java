package stringbasic;

import java.util.Arrays;

public class UniversityMain {

    public static void main(String[] args) {

        Person personOne = new Person("Kiss Balázs", "kissB@gmail.com", "046532987",
                "11111023-56489732", "+36309586321");
        Person personTwo = new Person("Nagy Réka", "nagyR@gmail.com", "089654123",
                "14569875-32658749-65133485", "+36709584312");

        Student studentOne = new Student(personOne, "SCYQZ5", "74236598156");
        studentOne.setEntranceCardNumber("5632846197");
        System.out.println(studentOne.getEducationalIdentifier());
        System.out.println(studentOne.getEntranceCardNumber());

        Student studentTwo = new Student(personTwo, "GH23L4", "783265491865");
        studentTwo.setEntranceCardNumber("4563289712");
        System.out.println(studentTwo.getNeptunCode());
        System.out.println(studentTwo.getEntranceCardNumber());

        Student studentThree = new Student(personTwo, "GH23L4", "783265491865");

        University university = new University();
        university.addStudent(studentThree);
        university.addStudent(studentOne);
        university.addStudent(studentTwo);

        System.out.println(university.getStudents().size());
        System.out.println(university.areEqual(studentOne, studentThree));
        System.out.println(university.areEqual(studentTwo, studentThree));
    }
}