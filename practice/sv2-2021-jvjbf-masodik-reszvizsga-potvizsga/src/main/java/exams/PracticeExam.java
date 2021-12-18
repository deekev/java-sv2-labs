package exams;

import java.util.List;

public class PracticeExam extends Exam {

    public static final int PERCENT_TO_OK = 51;
    public static final int PERCENT_TO_PERFECT = 76;

    public PracticeExam(long studentId, String topic, List<Integer> points) {
        super(studentId, topic);
        setMaxPoints(sumPoints(points));
    }

    @Override
    public void calculateExamResult(int actualPoints) {
        if (calculatePercent(actualPoints) >= PERCENT_TO_PERFECT) {
            setExamResult(ExamResult.PERFECT);
        } else if (calculatePercent(actualPoints) >= PERCENT_TO_OK) {
            setExamResult(ExamResult.OK);
        } else {
            setExamResult(ExamResult.NOT_PASSED);
        }
    }

    private int sumPoints (List<Integer> points) {
        int sum = 0;
        for (int i: points) {
            sum += i;
        }
        return validatePoints(sum);
    }

    private int validatePoints(int sum) {
        if (sum >= 10 && sum <= 150) {
            return sum;
        }
        throw new IllegalArgumentException("Maximum points should be between 10 and 150! Actual:" + sum);
    }

    private double calculatePercent(int points) {
        double result = 0;
        result = (double) points / getMaxPoints() * 100;
        return result;
    }
}
