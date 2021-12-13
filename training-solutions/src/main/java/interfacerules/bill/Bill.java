package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Bill {

    public List<String> readBillItemsFromFile(Path path) {
        List<String> result;
        try {
            result = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can't read file.", ioe);
        }
        return result;
    }
}
