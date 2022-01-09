package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {

    private Map<String, Integer> paper = new HashMap<>();

    public Map<String, Integer> getPaper() {
        return new HashMap<>(paper);
    }

    public void putFurtherPaper(String className, int kilogramms) {
        if (!paper.containsKey(className) && kilogramms != 0) {
            paper.put(className, kilogramms);
        } else {
            paper.put(className, paper.get(className) + kilogramms);
        }
    }

    public String getWinnerClass() {
        int max = 0;
        String winner = "";
        for (String s: paper.keySet()) {
            if (paper.get(s) > max) {
                max = paper.get(s);
                winner = s;
            }
        }
        return winner;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (int i: paper.values()) {
            sum += i;
        }
        return sum;
    }
}