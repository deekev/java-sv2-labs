package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Student {

    private String name;
    private List<Mark> grades = new ArrayList<>();

    public Student(String name) {
        validateName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark) {
        validateMark(mark);
        grades.add(mark);
    }

    public double calculateAverage() {
        if (!isGradeListEmpty()) {
            double average = ((double) sumGrades()) / countGrades();
            return formatDouble(average);
        }
        return 0;
    }

    public double calculateSubjectAverage(Subject subject) {
        if (countGradesBySubject(subject) > 0) {
            double average = ((double) sumGradesBySubject(subject)) / countGradesBySubject(subject);
            return formatDouble(average);
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(name).append(" marks: ");
        for (int i = 0; i < grades.size(); i++) {
            sb.append(grades.get(i).getSubject().getSubjectName());
            sb.append(": ");
            sb.append(grades.get(i).toString());
            if (grades.size() > 1 && i != grades.size() - 1) {
                sb.append("; ");
            }
        }
        return sb.toString();
    }

    private void  validateName(String name) {
        if (name.equals("") || name == null) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
    }

    private void validateMark(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
    }

    private boolean isGradeListEmpty() {
        return grades.isEmpty();
    }

    private int countGrades() {
        int count = 0;
        for (Mark actual: grades) {
            count ++;
        }
        return count;
    }

    private int sumGrades() {
        int sum = 0;
        for (Mark actual: grades) {
            sum += actual.getMarkType().getMarkNumber();
        }
        return sum;
    }

    private int countGradesBySubject(Subject subject) {
        int count = 0;
        for (Mark actual: grades) {
            if (subject.getSubjectName().equals(actual.getSubject().getSubjectName())) {
                count++;
            }
        }
        return count;
    }

    private int sumGradesBySubject(Subject subject) {
        int sum = 0;
        for (Mark actual: grades) {
            if (subject.getSubjectName().equals(actual.getSubject().getSubjectName())) {
                sum += actual.getMarkType().getMarkNumber();
            }
        }
        return sum;
    }

    private double formatDouble(double number) {
        String value = String.format(Locale.US,"%.2f", number);
        return Double.parseDouble(value);
    }
}