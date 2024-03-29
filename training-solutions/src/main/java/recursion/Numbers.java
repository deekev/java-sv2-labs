package recursion;

import java.util.Arrays;

public class Numbers {

    public int getSum(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        else if (numbers.length == 1) {
            return numbers[0];
        } else {
            return numbers[0] + getSum(Arrays.copyOfRange(numbers, 1, numbers.length));
        }
    }
}