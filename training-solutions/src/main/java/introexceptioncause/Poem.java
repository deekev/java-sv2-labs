package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {

    public static void main(String[] args) {

        Poem poem = new Poem();
        List<String> lines = new ArrayList<>();

        try {
            lines = poem.readFile();
        }
        catch (IllegalStateException ise) {
            System.out.println("Error: Can not read file");
            System.out.println(ise.getCause().getMessage());
            ise.getCause().printStackTrace();
        }

        poem.printFirstLetters(lines);
    }


    public List<String> readFile () {
        Path path = Paths.get("src/main/resources/poem.txt");
     // Path path = Paths.get("src/main/resources/poem_.txt");

        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void printFirstLetters(List<String> lines) {
        for (String actual: lines) {
            System.out.print(actual.charAt(0));
        }
    }
}