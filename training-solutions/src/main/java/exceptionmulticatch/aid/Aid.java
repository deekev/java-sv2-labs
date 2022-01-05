package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> result = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(path);
            for (String actual: lines) {
                String[] temp = actual.split(" ");
                int numberOfPeople = Integer.parseInt(temp[1]);
                int aidPerPerson = amount / numberOfPeople;
                StringBuilder sb = new StringBuilder(temp[0]).append(" ").append(aidPerPerson);
                result.add(sb.toString());
            }
            return result;
        }
        catch (NullPointerException | IOException | ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            throw new IllegalStateException("Something went wrong while counting.", e);
        }
    }
}