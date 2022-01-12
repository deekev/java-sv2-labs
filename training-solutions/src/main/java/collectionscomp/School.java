package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {

        Set<Student> studentsSet = new TreeSet<>(new StudentComparator());
        studentsSet.add(new Student("Kiss Nóra", 155));
        studentsSet.add(new Student("Nagy Tamás", 198));
        studentsSet.add(new Student("Tóth Gábor", 181));
        studentsSet.add(new Student("Varga Kata", 169));
        studentsSet.add(new Student("Szép Lilla", 159));
        studentsSet.add(new Student("Réti Dávid", 173));

        System.out.println(studentsSet);


        Map<String, Integer> studentsMap = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        for (Student s : studentsSet) {
            studentsMap.put(s.getName(), s.getHeight());
        }

        System.out.println(studentsMap);
    }
}