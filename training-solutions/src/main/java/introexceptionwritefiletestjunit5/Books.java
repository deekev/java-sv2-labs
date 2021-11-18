package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public void writeReadableList(Path path) {
        List<String> books = readFile();
        List<String> booksReadable = new ArrayList<>();
        for (String actual : books) {
            String[] temp = actual.split(";");
            booksReadable.add(temp[2] + ": " + temp[1]);
        }
        writeFile(path, booksReadable);
    }

    private List<String> readFile() {
        try {
            return Files.readAllLines(Paths.get("src/test/resources/books.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void writeFile(Path path, List<String> booksReadable) {
        try {
            Files.write(path, booksReadable);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}