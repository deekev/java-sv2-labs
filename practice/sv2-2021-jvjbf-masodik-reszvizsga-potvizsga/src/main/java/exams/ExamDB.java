package exams;

import java.util.ArrayList;
import java.util.List;

public class ExamDB {

    private List<Exam> exams = new ArrayList<>();

    public void addExam(Exam exam, int actualPoints) {
        exam.calculateExamResult(actualPoints);
        exams.add(exam);
    }

    public List<Exam> getExams() {
        return new ArrayList<>(exams);
    }

    public int countPassedExams() {
        int count = 0;
        for (Exam e: exams) {
            if (e.getExamResult() != ExamResult.NOT_PASSED) {
                count++;
            }
        }
        return count;
    }

    public List<Exam> findById(long studentId) {
        List<Exam> result = new ArrayList<>();
        for (Exam e: exams) {
            if (e.getStudentId() == studentId) {
                result.add(e);
            }
        }
        return result;
    }

    public List<String> findTopicByPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        for (Exam e: exams) {
            if (e.getTopic().startsWith(prefix) && !result.contains(e.getTopic())) {
                result.add(e.getTopic());
            }
        }
        return result;
    }
}