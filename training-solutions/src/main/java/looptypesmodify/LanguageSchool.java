package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {

        List<Student> listOfStudents = new ArrayList<>();
        Student student1 = new Student("Kárpáti Judit");
        Student student2 = new Student("Erdei Miklós");
        Student student3 = new Student("Kiss Noémi");
        Student student4 = new Student("Fülöp Anita");
        Student student5 = new Student("Kalmár Bence");
        Student student6 = new Student("Huszár Dorottya");
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        listOfStudents.add(student5);
        listOfStudents.add(student6);

        System.out.println(listOfStudents.size());

        student1.setActive(false);
        student4.setActive(false);

        List<Student> notActive = new ArrayList<>();
        for (Student student: listOfStudents){
            if(student.isActive() == false){
                notActive.add(student);
            }
        }
        listOfStudents.removeAll(notActive);
        System.out.println(listOfStudents.size());
    }
}