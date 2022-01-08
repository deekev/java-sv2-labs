package collectionslist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {

    private List<String> bunch = new LinkedList<>();

    public List<String> getBunch() {
        return new ArrayList<>(bunch);
    }

    public void addFlower(String flower) {
        bunch.add(flower);
    }

    public void addFlowerInTheMiddle(String flower) {
        if (bunch.isEmpty()) {
            bunch.add(flower);
        }
        int index = bunch.size() / 2;
        if (bunch.size() % 2 == 0) {
            bunch.add(index, flower);
        } else {
            bunch.add(index, flower);
            bunch.add(index + 2, flower);
        }
    }
}