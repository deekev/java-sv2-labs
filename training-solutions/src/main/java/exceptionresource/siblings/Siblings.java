package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {

    public List<String> getFullNames(String lastName, Path path) {
        validateLastName(lastName);
        List<String> fullNames = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String name = lastName + " " + scanner.nextLine();
                fullNames.add(name);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return fullNames;
    }

    private void validateLastName(String lastName) {
        if (lastName == null) {
            throw new NullPointerException("Last name is null.");
        }
        if (lastName.isBlank()) {
            throw new IllegalArgumentException("Last name can't be empty.");
        }
    }
}