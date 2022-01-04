package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array is null!");
        }
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        return sum;
    }

    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array is null!");
        }
        int sum = 0;
        for (String s: numbers) {
            try {
                sum += Integer.parseInt(s);
            }
            catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Invalid number", nfe);
            }
        }
        return sum;
    }
}