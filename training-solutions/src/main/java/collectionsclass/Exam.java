package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {

    private List<ExamResult> examResults;

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<ExamResult> getExamResults() {
        return new ArrayList<>(examResults);
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<ExamResult> ordered = getExamResultsInOrder();
        List<String> succeeded = new ArrayList<>();
        int counter = places;
        if (places > ordered.size()) {
            counter = ordered.size();
        }
        for (int i = 0; i < counter; i++) {
            succeeded.add(ordered.get(i).getName());
        }
        return succeeded;
    }

    private List<ExamResult> getExamResultsInOrder() {
        List<ExamResult> ordered = new ArrayList<>(examResults);
        Collections.sort(ordered);
        Collections.reverse(ordered);
        return ordered;
    }
}
