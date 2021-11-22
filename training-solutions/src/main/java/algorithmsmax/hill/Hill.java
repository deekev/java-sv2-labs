package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> heights) {
        int maxHeight = heights.get(0);
        for (int actual: heights) {
            if (actual > maxHeight) {
                maxHeight = actual;
            }
        }
        return maxHeight;
    }
}