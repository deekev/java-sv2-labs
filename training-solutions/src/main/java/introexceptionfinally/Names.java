package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Names {

    public static void main(String[] args) {
        try {
           Path path = Paths.get("src/main/resources/names.txt");
           // Path path = Paths.get("src/main/resources/anothernames.txt");
           // Path path = Paths.get("src/main/resources/anothernames.txt");
            List<String> names = Files.readAllLines(path);
            System.out.println(new Names().findPrefix(names));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        finally {
            System.out.println("End of reading.");
        }
    }

    private String findPrefix (List<String> names) {
        for (String actual: names) {
            if (actual.startsWith("dr.")) {
                return actual;
            }
        }
        return "";
    }
}