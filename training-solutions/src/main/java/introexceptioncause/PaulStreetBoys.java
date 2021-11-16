package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {

    public static void main(String[] args) {

        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
        List<String> names = new ArrayList<>();

        try {
            names = paulStreetBoys.readFile();
        }
        catch (IllegalStateException ise) {
            System.out.println("Error: Can not read file");
            System.out.println(ise.getCause().getMessage());
        }

        paulStreetBoys.printNames(names);
    }


    public List<String> readFile() {
        Path path = Paths.get("src/main/resources/palutcaifiuk.txt");
     // Path path = Paths.get("src/main/resources/palutcaifiuk_.txt");
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void printNames(List<String> names) {
        for (String actual: names) {
            if (actual.equals("Nemecsek Ernő")){
                System.out.println(actual.toLowerCase());
            }
            else {
                System.out.println(actual);
            }
        }
    }
}
