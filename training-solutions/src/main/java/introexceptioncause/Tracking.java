package introexceptioncause;

import java.util.ArrayList;
import java.util.List;

public class Tracking {

    public static void main(String[] args) {

        TrackPoints trackPoints = new TrackPoints();
        List<String> points = new ArrayList<>();

        try {
            points = trackPoints.readFile();
        }
        catch (IllegalStateException ise) {
            System.out.println("Error: Can not read file.");
            System.out.println(ise.getCause().getMessage());
        }

        int[] heights = trackPoints.getHeights(points);
        trackPoints.printHeightsChanges(heights);
    }
}