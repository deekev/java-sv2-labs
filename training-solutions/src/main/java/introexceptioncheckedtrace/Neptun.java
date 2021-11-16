package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    public static void main(String[] args) {

        try {
            List<String> namesWithNeptunCode = new Neptun().readFile();
            System.out.println(new Neptun().getNeptunCodes(namesWithNeptunCode));
        }
        catch (IOException ioe) {
            System.out.println("Can not read file");
            ioe.printStackTrace();
        }

    }

    private List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/neptun.csv"));
    }

    private List<String> getNeptunCodes(List<String> list) {
        List<String> neptunCodes = new ArrayList<>();
        for (String actual: list) {
            neptunCodes.add(actual.substring(actual.indexOf(',') + 1));
        }
        return neptunCodes;
    }
}