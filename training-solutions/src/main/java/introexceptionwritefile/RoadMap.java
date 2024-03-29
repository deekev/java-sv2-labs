package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {

        List<String> route = Arrays.asList("Eger", "Kerecsend", "Kápolna", "Detk", "Visonta", "Gyöngyös");
        Path path = Paths.get("src/main/resources/roadmap.txt");

        try {
            Files.write(path, route);
        }
        catch (IOException ioe) {
            System.out.println("Can not write file");
            ioe.printStackTrace();
        }
    }
}
