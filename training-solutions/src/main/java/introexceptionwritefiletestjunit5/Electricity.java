package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    public void writeStreets(Path path) {
        try {
            Files.write(path, getListOfStreets());
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    private List<String> getListOfStreets() {
        List<String> streetNames = new ArrayList<>();
        streetNames.add(LocalDate.now().toString());
        streetNames.add("Malomárok utca");
        streetNames.add("Cifrakapu utca");
        streetNames.add("Kallómalom utca");
        streetNames.add("Vallon utca");
        return streetNames;
    }
}
