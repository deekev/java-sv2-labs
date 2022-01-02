package schoolrecords;

public class StudyResultByName {

    private String studentName;
    private double studyAverage;

    public StudyResultByName(String studentName, double average) {
        this.studentName = studentName;
        this.studyAverage = average;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }
}