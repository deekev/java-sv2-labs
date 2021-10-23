package finalmodifier;

public class PiMain {

    public static void main(String[] args) {

        System.out.println(CircleCalculator.PI);

        double radius = 5.63;
        double height = 9.76;

        System.out.println(new CircleCalculator().calculatePerimeter(radius));
        System.out.println(new CircleCalculator().calculateArea(radius));
        System.out.println(new CylinderCalculator().calculateSurfaceArea(radius, height));
        System.out.println(new CylinderCalculator().calculateVolume(radius, height));
        System.out.println(new CylinderCalculatorBasedOnCircle().calculateSurfaceArea(radius, height));
        System.out.println(new CylinderCalculatorBasedOnCircle().calculateVolume(radius, height));
    }
}
