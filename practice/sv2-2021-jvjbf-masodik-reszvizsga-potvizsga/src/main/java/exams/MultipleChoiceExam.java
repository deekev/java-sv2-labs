package exams;

public class MultipleChoiceExam extends Exam {

    public static final int PERCENT_TO_PASS = 51;

    public MultipleChoiceExam(long studentId, String topic) {
        super(studentId, topic);
    }

    public MultipleChoiceExam(long studentId, String topic, int maxPoints) {
        super(studentId, topic, maxPoints);
    }

    @Override
    public void calculateExamResult(int actualPoints) {
        validatePoints(actualPoints);
        if ((double) actualPoints / getMaxPoints() * 100 >= PERCENT_TO_PASS) {
            setExamResult(ExamResult.PASSED);
        } else {
            setExamResult(ExamResult.NOT_PASSED);
        }
    }

    private void validatePoints(int points) {
        if (points < 0 || points > getMaxPoints()) {
            throw new IllegalArgumentException("Points can't be less than 0 or more than " + getMaxPoints());
        }
    }
}
