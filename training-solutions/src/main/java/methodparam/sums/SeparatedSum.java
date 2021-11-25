package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SeparatedSum {

    public Sum sum(String floatingNumbers) {
        String[] temp = floatingNumbers.replace(",", ".").split(";");
        double positiveSum = 0;
        double negativeSum = 0;
        for (String s: temp) {
            double number = Double.parseDouble(s);
            if (number >= 0) {
                positiveSum += number;
            }
            else {
                negativeSum += number;
            }
        }
        return new Sum(positiveSum, negativeSum);
    }

    public String readText(Path path) {
        try {
            String floatingNumbers = Files.readAllLines(path).get(0);
            return floatingNumbers;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }
}