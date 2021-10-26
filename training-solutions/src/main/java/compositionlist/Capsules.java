package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> colorsOfCapsules = new ArrayList<>();

    public void addLast(String color) {
        colorsOfCapsules.add(color);
    }

    public void addFirst(String color) {
        colorsOfCapsules.add(0, color);
    }

    public void removeFirst() {
        colorsOfCapsules.remove(0);

    }

    public void removeLast() {
        colorsOfCapsules.remove(colorsOfCapsules.size() - 1);
    }

    public List<String> getColors() {
        return colorsOfCapsules;
    }
}