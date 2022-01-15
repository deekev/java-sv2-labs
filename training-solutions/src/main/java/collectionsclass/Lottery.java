package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (lotteryType >= ballCount) {
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }
        List<Integer> balls = fillBalls(ballCount);
        List<Integer> winnigNumbers = new ArrayList<>(balls.subList(0, lotteryType));
        Collections.sort(winnigNumbers);
        return winnigNumbers;
    }

    private List<Integer> fillBalls(int balls) {
        List<Integer> numberOfBalls = new ArrayList<>();
        for (int i = 1; i <= balls; i++) {
            numberOfBalls.add(i);
        }
        Collections.shuffle(numberOfBalls);
        return numberOfBalls;
    }
}