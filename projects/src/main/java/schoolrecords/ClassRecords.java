package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student) {
        if (getIndexOfStudent(student) < 0) {
            return students.add(student);
        }
        return false;
    }

    public boolean removeStudent(Student student) {
        int index = getIndexOfStudent(student);
        if (index >= 0) {
            students.remove(index);
            return true;
        }
        return false;
    }

    public double calculateClassAverage() {
        validateMembersOfCalculation();
        double sum = 0;
        for (Student s: students) {
            sum += s.calculateAverage();
        }
        return formatDouble(sum / students.size());
    }

    public double calculateClassAverageBySubject(Subject subject) {
        validateMembersOfCalculation();
        double sum = 0;
        int numberOfStudentsWithSubject = 0;
        for (Student s: students) {
            if (s.calculateSubjectAverage(subject) > 0) {
                sum += s.calculateSubjectAverage(subject);
                numberOfStudentsWithSubject++;
            }
        }
        return formatDouble(sum / numberOfStudentsWithSubject);
    }

    public Student findStudentByName(String name) {
        validateString(name);
        validateList();
        for (Student s : students) {
            if (name.equals(s.getName())) {
                return s;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition() {
        if (isListEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(random.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        validateList();
        List<StudyResultByName> namesWithAverage = new ArrayList<>();
        for (Student s: students) {
            namesWithAverage.add(new StudyResultByName(s.getName(), s.calculateAverage()));
        }
        return namesWithAverage;
    }

    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            if (students.indexOf(s) == 0) {
                sb.append(s.getName());
            } else {
                sb.append(", ");
                sb.append(s.getName());
            }
        }
        return sb.toString();
    }

    private boolean isListEmpty() {
        if (students == null || students.size() == 0) {
            return true;
        }
        return false;
    }

    private void validateList() {
        if (isListEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
    }

    private int getIndexOfStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(student.getName())) {
                return i;
            }
        }
        return -1;
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    private void validateString(String str) {
        if (isEmpty(str)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
    }

    private boolean isAnyMark() {
        for (Student s: students) {
            if (s.calculateAverage() > 0) {
                return true;
            }
        }
        return false;
    }

    private void validateMembersOfCalculation() {
        if (isListEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        if (!isAnyMark()) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
    }

    private double formatDouble(double number) {
        String value = String.format(Locale.US,"%.2f", number);
        return Double.parseDouble(value);
    }
}