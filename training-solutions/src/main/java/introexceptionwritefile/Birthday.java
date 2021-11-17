package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> birthDays = new ArrayList<>();

        System.out.println("Rögzítse a fontos születésnapokat.");
        System.out.println("Hány születésnapot kíván rögzíteni?");

        int numberOfBirthDays = 0;
        try{
            numberOfBirthDays = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Contains characters other than digits");
        }

        int count = 0;
        while (count < numberOfBirthDays) {
            System.out.println("Adja meg a nevet és a dátumot egy sorban.");
            birthDays.add(scanner.nextLine());
            count++;
        }

        Path path = Paths.get("src/main/resources/birthdays.txt");
        try {
            Files.write(path, birthDays);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}