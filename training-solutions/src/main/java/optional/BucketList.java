package optional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BucketList {

    private List<Destination> destinations = new ArrayList<>();

    public List<Destination> getDestinations() {
        return new ArrayList<>(destinations);
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
        destinations.sort((o1, o2) ->
                o1.getKmFromHome() - o2.getKmFromHome());
    }

    public Optional<Destination> getDestinationWithKeyword(String keyword) {
        for (Destination actual : destinations) {
            if (actual.getDescription().contains(keyword)) {
                return Optional.of(actual);
            }
        }
        return Optional.empty();
    }

    public Optional<Destination> getDestinationNearerThanGiven(int maxKm) {
        for (Destination actual : destinations) {
            if (actual.getKmFromHome() < maxKm) {
                return Optional.of(actual);
            }
        }
        return Optional.empty();
    }
}
