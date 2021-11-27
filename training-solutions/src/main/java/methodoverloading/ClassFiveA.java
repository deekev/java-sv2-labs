package methodoverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

    private List<String> names = new ArrayList<>(Arrays.asList("Gárdos Helga", "Joó Lilla", "Kiss József", "Nagy Béla",
            "Németh Dóra", "Pongrácz Imola", "Rendes Richárd", "Szabó Nóra", "Takács Júlia", "Vígh Elemér"));

    public String getTodayReferringStudent(int number) {
        return names.get(number - 1);
    }

    public String getTodayReferringStudent(Number number) {
        return names.get(number.getValue() - 1);
    }

    public String getTodayReferringStudent(String numberName) {
        return names.get((Number.valueOf(numberName.toUpperCase()).getValue()) - 1);
    }
}