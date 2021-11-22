package algorithmscount;

public class Digits {

    public int getCountOfNumbers() {
        int count = 0;
        for (int i = 16; i <= 94; i++) {
            int firstDigit = Integer.parseInt(Integer.toString(i).substring(0,1));
            int secondDigit = Integer.parseInt(Integer.toString(i).substring(1));
            if (Math.abs(firstDigit - secondDigit) == 5) {
                count++;
            }
        }
        return count;
    }
}