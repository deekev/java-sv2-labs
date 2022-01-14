package searching;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LostAndFoundOffice {

    private List<LostProperty> properties = new ArrayList<>();

    public void addProperty(LostProperty property) {
        properties.add(property);
    }

    public List<LostProperty> getProperties() {
        return new ArrayList<>(properties);
    }

    public LostProperty findLostProperty(String description, LocalDate date) {
        int index = Collections.binarySearch(properties, new LostProperty(description, date));
        if (index >= 0) {
            return properties.get(index);
        } else {
            throw new IllegalArgumentException("Property not found.");
        }
    }

    public void sortProperties() {
        Collections.sort(properties);
    }
}
