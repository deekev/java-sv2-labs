package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        if (isTrooperNull(trooper)) {
            throw new IllegalArgumentException("Trooper can be not null.");
        }
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        if (isEmty(name) || isPositionNull(target)) {
            throw new IllegalArgumentException("Name or position can not be null.");
        }
        Trooper result = findTrooperByName(name);
        if (result != null) {
            moveTrooper(result, target);
        }
    }

    public void moveClosestTrooper(Position target) {
        if (isPositionNull(target)) {
            throw new IllegalArgumentException("Position can not be null.");
        }
        Trooper result = findClosestTrooper(target);
        if (result != null) {
            moveTrooper(result, target);
        }
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper actual: troopers) {
            if (name.equals(actual.getName())) {
                return actual;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position target) {
        if (target == null) {
            return null;
        }
        Trooper closest = troopers.get(0);
        for (Trooper actual : troopers) {
            if (actual.distanceFrom(target) < closest.distanceFrom(target)) {
                closest = actual;
            }
        }
        return closest;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    private boolean isEmty(String text) {
        return text == null || text.isBlank();
    }

    private boolean isPositionNull(Position position) {
        return position == null;
    }

    private boolean isTrooperNull(Trooper trooper) {
        return trooper == null;
    }
}