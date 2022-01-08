package collectionsset;

import java.util.*;

public class QuestionGame {

    public static final int NUMBER_OF_WINNERS = 5;
    private List<RightAnswer> rightAnswers;

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Set<String> drawWinners() {
        Set<String> result = new HashSet<>();
        while (result.size() < NUMBER_OF_WINNERS && rightAnswers.size() > 0) {
            int index = new Random().nextInt(0, rightAnswers.size());
            result.add(rightAnswers.get(index).getName());
            rightAnswers.remove(index);
        }
        if (result.size() == NUMBER_OF_WINNERS) {
            return result;
        } else {
            throw new IllegalArgumentException("Not enough right answers!");
        }
    }
}