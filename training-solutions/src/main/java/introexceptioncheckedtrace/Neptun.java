package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    public static void main(String[] args) {

        Neptun neptun = new Neptun();
        List<String> namesWithNeptunCode = new ArrayList<>();

        try {
            namesWithNeptunCode = neptun.readFile();
        }
        catch (IOException ioe) {
            System.out.println("Can not read file");
            ioe.printStackTrace();
        }

        System.out.println(neptun.getNeptunCodes(namesWithNeptunCode));

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