package firstnumber;

public class FirstNumber {

    public char getFirstNumber(String s) {
        for (char actual: s.toCharArray()) {
            if (Character.isDigit(actual)) {
                return actual;
            }
        }
        return ' ';
    }
}