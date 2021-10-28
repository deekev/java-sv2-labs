package operators;

public class Operators {

    public boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getResultOfDivision(int number, int divisor) {
        int result = number / divisor;
        int remain = number % divisor;
        return number + " / " + divisor + " = " + result + ", maradék: " + remain;
    }

    public String isNull(String s) {
        if (s == null) {
            return "null értékű";
        } else {
            return "nem null értékű";
        }
    }

    public boolean isEmpty(String s) {
        if (s == null || "".equals(s)) {
            return true;
        } else {
            return false;
        }
    }
}