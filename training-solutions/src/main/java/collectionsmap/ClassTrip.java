package collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {

    private Map<String, Integer> inpayments = new HashMap<>();

    public void loadInpayments(Path path) {
        List<String> lines = readFile(path);
        for (String s: lines) {
            String[] temp = s.split(": ");
            String key = temp[0];
            int value = parseToInteger(temp[1]);
            inpayments.put(key, value);
        }
    }

    public Map<String, Integer> getInpayments() {
        return inpayments;
    }

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    private int parseToInteger(String part) {
        try {
            return Integer.parseInt(part);
        }
        catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Can't convert to number.", nfe);
        }
    }
}
