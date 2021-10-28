package conversions;

public class TooBigNumber {

    public long getRightResult(int number) {
        long max = 2_147_483_647;
        return max + number;
    }

    public static void main(String[] args) {

        System.out.println(new TooBigNumber().getRightResult(958_456_698));
    }
}