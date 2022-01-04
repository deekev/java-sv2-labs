package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public List<String> validate(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (String s: lines) {
            String[] temp = s.split(",");
            if (temp.length != 3 || !canBeConvertedToInteger(temp[0]) || !canBeConvertedToDouble(temp[1]) || !isNameValid(temp[2])) {
                result.add(s);
            }
        }
        return result;
    }

    private boolean canBeConvertedToInteger(String number) {
        try {
            Integer.parseInt(number);
            return true;
        }
        catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean canBeConvertedToDouble(String number) {
        try {
            Double.parseDouble(number);
            return true;
        }
        catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean isNameValid(String name) {
        if (name.isBlank() || name.indexOf(" ") < 1 || name.indexOf(" ") == name.length() - 1) {
            return false;
        }
        return true;
    }
}