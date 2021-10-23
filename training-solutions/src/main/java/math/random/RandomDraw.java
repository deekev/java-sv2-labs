package math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Dávid", "Krisztina", "Péter", "Edina", "Gergő", "Anna", "Mária", "Tamás", "László", "Barbara");
        Random random = new Random();

        int numberOne = random.nextInt(5);
        int numberTwo = random.nextInt(6, 10);

        System.out.println("A nyertesek: " + names.get(numberOne) +" és " + names.get(numberTwo));
    }
}