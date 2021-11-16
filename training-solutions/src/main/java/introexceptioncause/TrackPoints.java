package introexceptioncause;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TrackPoints {

    public List<String> readFile() {
        try {
            return Files.readAllLines(Paths.get("src/main/resources/tracking.csv"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public int[] getHeights(List<String> trackPoints) {
        int[] heights = new int[trackPoints.size()];
        int index;
        for (int i = 0; i < trackPoints.size(); i++) {
            index = trackPoints.get(i).lastIndexOf(';') + 1;
            heights[i] = Integer.parseInt(trackPoints.get(i).substring(index));
        }
        return heights;
    }

    public void printHeightsChanges(int[] heights) {
        for (int i = 1; i < heights.length; i++) {
            System.out.println(heights[i] - heights[i-1]);
        }
    }
}
