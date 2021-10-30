package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Lukács Dániel", "Magyar Eszter",
                "Németh Diána", "Tóth Gergely"));

        for (String s: names) {
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!", s);
            System.out.println();
        }
    }
}