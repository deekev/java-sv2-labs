package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {

    public static void main(String[] args) {
        try {
            List<String> thingsForHoliday = Files.readAllLines(Paths.get("src/main/resources/holiday.txt"));
         // List<String> thingsForHoliday = Files.readAllLines(Paths.get("src/main/resources/holiday_txt"));

            System.out.println(thingsForHoliday);
        }
        catch (IOException ioe) {
            System.out.println("Can not read file.");
            ioe.printStackTrace();
        }
    }
}