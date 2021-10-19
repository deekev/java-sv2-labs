package linebreak;

public class Car {

    public String getBrandAndTypeInSeparateLines(String brand, String type) {
        return brand + System.lineSeparator() + type;
    }

    public static void main(String[] args) {

        Car car = new Car();
        System.out.print(car.getBrandAndTypeInSeparateLines("Ford", "Mustang"));
    }
}
