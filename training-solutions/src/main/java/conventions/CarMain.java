package conventions;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car("Suzuki", "hibrid", 5, 5);

        System.out.println("Márka: " + car.getCarType());
        System.out.println("Motor típusa: " + car.getEngineType());
        System.out.println("Ajtók száma: " + car.getDoors());
        System.out.println("Személyek száma: " + car.getPersons());
        System.out.println();

        car.setCarType("Ford");
        car.addModelName("Mustang");
        car.setEngineType("benzin");
        car.setDoors(2);
        car.setPersons(4);

        System.out.println("Márka: " + car.getCarType());
        System.out.println("Motor típusa: " + car.getEngineType());
        System.out.println("Ajtók száma: " + car.getDoors());
        System.out.println("Személyek száma: " + car.getPersons());

    }
}
