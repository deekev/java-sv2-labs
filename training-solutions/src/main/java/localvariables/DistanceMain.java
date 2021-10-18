package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(131.745, true);

        System.out.println("It is " + distance.isExact()+ " that the distance between\r\n" +
                "Eger and Budapest is " + distance.getDistanceInKm() + "km.");

        int roundedDistance = (int) distance.getDistanceInKm();
        System.out.println("As a whole number: " + roundedDistance + " km.");
    }

}
