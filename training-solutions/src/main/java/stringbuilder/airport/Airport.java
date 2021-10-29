package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder stringBuilder = new StringBuilder("Törölt járatok:");
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getStatus() == Status.DELETED) {
                stringBuilder.append("\n");
                stringBuilder.append(flights.get(i).getFlightNumber());
            }
        }
        return stringBuilder.toString();
    }
}