package algorithmsdecision.towns;

import java.util.List;

public class Town {

    public boolean containsFewerHabitants(List<Integer> populations, int limit) {
        for (int actual: populations) {
            if (actual < limit) {
                return true;
            }
        }
        return false;
    }
}