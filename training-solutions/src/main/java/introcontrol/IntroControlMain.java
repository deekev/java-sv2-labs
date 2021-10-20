package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {

        IntroControl test = new IntroControl();

        System.out.println(test.subtractTenIfGreaterThanTen(54));
        System.out.println(test.subtractTenIfGreaterThanTen(9));

        System.out.println(test.describeNumber(12));
        System.out.println(test.describeNumber(0));

        System.out.println(test.greetingToJoe("Joe"));
        System.out.println(test.greetingToJoe("John"));

        System.out.println(test.calculateBonus(1000000));
        System.out.println(test.calculateBonus(999999));

        System.out.println(test.calculateConsumption(7569,8356));
        System.out.println(test.calculateConsumption(9999, 125));

        test.printNumbers(5);

        test.printNumbersBetween(3, 9);

        test.printNumbersBetweenAnyDirection(2, 6);
        test.printNumbersBetweenAnyDirection(8, 3);

        test.printOddNumbers(11);
    }
}