package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> thingsToDo = new ArrayList<>();

        System.out.println("Rögzítse a mai teendőket.\nx billentyű megnyomására elmenti a listát");

        String toDo = scanner.nextLine();

        do {
            thingsToDo.add(toDo);
            toDo = scanner.nextLine();
        }
        while (!"x".equals(toDo));

        Path path = Paths.get("src/main/resources/todos.txt");
        try {
            Files.write(path, thingsToDo);
        }
        catch (IOException ioe) {
            System.out.println("Can not write file");
            ioe.printStackTrace();
        }
    }

}