package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number) {
        if (number <= 10) {
            return number;
        } else {
            number -= 10;
            return number;
        }
    }

    public String describeNumber(int number) {
        if (number == 0){
            return "zero";
        } else {
            return "not zero";
        }
    }

    public String greetingToJoe(String name) {
        if ("Joe".equals(name)){
            return "Hello " + name;
        } else {
            return "";
        }
    }

    public int calculateBonus(int sale){
        if (sale >= 1000000) {
            return sale * 10 / 100;
        } else {
            return 0;
        }
    }

    public int calculateConsumption(int prev, int next) {
        if (prev <= next){
            return next - prev;
        } else {
            return (9999 - prev) + next;
        }
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max){
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b){
        if (a < b){
            for (int i = a; i <= b; i++){
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= b; i--){
                System.out.println(i);
            }
        }
    }

    public void printOddNumbers(int max){
        for (int i = 1; i <= max; i++){
            if ((i % 2) != 0){
                System.out.println(i);
            }
        }
    }
}