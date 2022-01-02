package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> subjects = new ArrayList<>();

    public Tutor(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
       for (Subject actual: subjects) {
           if (subject.getSubjectName().equals(actual.getSubjectName())) {
               return true;
           }
       }
       return false;
    }
}