package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {

    private List<Integer> digits = new ArrayList<>();

    public List<Integer> getDigits() {
        return digits;
    }

    public void addDigitsToList(String text) {
        for (char s: text.toCharArray()) {
            if (Character.isDigit(s)) {
                digits.add(Integer.parseInt(Character.toString(s)));
            }
        }
    }
}