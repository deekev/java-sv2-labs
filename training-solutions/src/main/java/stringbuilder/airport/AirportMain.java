package stringbuilder.airport;

public class AirportMain {

    public static void main(String[] args) {

        Airport airport = new Airport();

        Flight flightOne = new Flight("B-2351", Status.DELETED);
        Flight flightTwo = new Flight("F-3586", Status.ACTIVE);
        Flight flightThree = new Flight("N-312561", Status.DELETED);
        Flight flightFour = new Flight("H-426238", Status.ACTIVE);
        Flight flightFive = new Flight("S-35", Status.DELETED);
        Flight flightSix = new Flight("KL-894", Status.ACTIVE);

        airport.addFlight(flightOne);
        airport.addFlight(flightTwo);
        airport.addFlight(flightThree);
        airport.addFlight(flightFour);
        airport.addFlight(flightFive);
        airport.addFlight(flightSix);

        System.out.println(airport.getDeletedFlights());
    }
}