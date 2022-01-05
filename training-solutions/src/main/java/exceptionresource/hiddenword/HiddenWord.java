package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path) {
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNextLine()) {
                sb.append(findLetter(sc.nextLine()));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can't read file.", ioe);
        }
        return sb.toString();
    }

    private char findLetter(String line) {
        for (char c: line.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                return c;
            }
        }
        return ' ';
    }
}