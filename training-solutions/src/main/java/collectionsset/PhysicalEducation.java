package collectionsset;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> heights = new TreeSet<>();
        for (Student s: students) {
            heights.add(s.getHeight());
        }
        return heights;
    }


    public static void main(String[] args) {

        PhysicalEducation physicalEducation = new PhysicalEducation();

        List<Student> students = Arrays.asList(
                new Student("Kiss József", 187),
                new Student("Nagy Béla", 193),
                new Student("Szép Virág", 163),
                new Student("Németh Luca", 174),
                new Student("Szabó László", 182),
                new Student("Kiss József", 162),
                new Student("Kovács Mária", 168));

        Set<Integer> heights = physicalEducation.getOrderInLessons(students);
        System.out.println(heights);
    }
}