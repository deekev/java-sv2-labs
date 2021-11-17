package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {

    public String getFirstWordWithA(Path path) {
        List<String> words = readFile(path);
        for (String actual: words) {
            if (actual.startsWith("A")){
                return actual;
            }
        }
        return "A";
    }

    private List<String> readFile(Path path){
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}