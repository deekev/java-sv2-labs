package conversions;

public class DigitsMain {

    public static void main(String[] args) {

        Digits digits = new Digits();
        digits.addDigitsToList("hjllé6jjkk2jj8fj43jj6sx");

        System.out.println(digits.getDigits());
    }
}