package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("kártya", "macska", "sál", null, "asztal", "tányér"));

        try {
            for (String word : words) {
                System.out.println(word.charAt(0));
            }
        }
        catch (NullPointerException npe) {
            System.out.println("Hiba!");
            System.out.println(npe.getMessage());
        }
    }
}