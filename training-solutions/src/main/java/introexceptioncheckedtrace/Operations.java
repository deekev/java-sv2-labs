package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public List<String> readFile() throws IOException {

        return Files.readAllLines(Paths.get("src/main/resources/underground.txt"));
     // return Files.readAllLines(Paths.get("src/main/resources/underground_.txt"));
    }

    public String getDailySchedule(List<String> carNumbers) {

        StringBuilder stringBuilder = new StringBuilder(LocalDate.now().toString());
        stringBuilder.append(", ");
        for (String actual: carNumbers) {
            if (actual.startsWith("2")) {
                stringBuilder.append(actual);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}