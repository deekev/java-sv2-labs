package sumofdigits;

public class SumOfDigits {

    public int getSumOfDigits(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        int sum = 0;
        for (char actual: digits) {
            sum += Integer.parseInt(Character.toString(actual));
        }
        return sum;
    }
}