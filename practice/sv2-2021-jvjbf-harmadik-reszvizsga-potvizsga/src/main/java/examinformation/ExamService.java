package examinformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ExamService {

    private static final double PERCENT_TO_PASS = 0.51;

    private int theoryMax;
    private int practiceMax;
    private Map<String, ExamResult> results = new TreeMap<>();

    public int getTheoryMax() {
        return theoryMax;
    }

    public int getPracticeMax() {
        return practiceMax;
    }

    public Map<String, ExamResult> getResults() {
        return new TreeMap<>(results);
    }

    public void readFromFIle(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line = br.readLine();
            setMaxPoinst(line);
            while ((line = br.readLine()) != null) {
                fillMap(line);
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file: " + path, ioe);
        }
    }

    public List<String> findPeopleFailed() {
       return results.entrySet().stream()
                .filter(entry -> entry.getValue().getTheory() < (theoryMax * PERCENT_TO_PASS)
                        || entry.getValue().getPractice() < (practiceMax * PERCENT_TO_PASS))
                .map(stringExamResultEntry -> stringExamResultEntry.getKey())
                .toList();
    }

    public String findBestPerson() {
        Map<String, ExamResult> passed = removeFailed();
        Optional<String> best = Optional.empty();
        int maxPoints = 0;
        for (Map.Entry<String, ExamResult> entry: passed.entrySet()) {
            int points = entry.getValue().getTheory() + entry.getValue().getPractice();
            if (points > maxPoints) {
                maxPoints = points;
                best = Optional.of(entry.getKey());
            }
        }
        return best.orElseThrow(() -> new IllegalArgumentException("Everyone failed."));
    }

    private void setMaxPoinst(String line) {
        String[] temp = line.split(" ");
        theoryMax = Integer.parseInt(temp[0]);
        practiceMax = Integer.parseInt(temp[1]);
    }

    private void fillMap(String line) {
        String[] temp = line.split(";");
        String key = temp[0];
        ExamResult examResult = createExamResult(temp[1]);
        results.put(key, examResult);
    }

    private ExamResult createExamResult(String part) {
        String[] temp = part.split(" ");
        ExamResult examResult = new ExamResult(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        return examResult;
    }

    private Map<String, ExamResult> removeFailed() {
        List<String> failed = findPeopleFailed();
        Map<String, ExamResult> temp = new TreeMap<>(results);
        for (String actual: failed) {
            temp.remove(actual);
        }
        return temp;
    }
}
