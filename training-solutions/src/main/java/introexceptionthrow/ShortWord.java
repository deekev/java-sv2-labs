package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Írjon egy 5 betűből álló szót:");
        String word = scanner.nextLine();

        if (word.length() != 5) {
            throw new IllegalArgumentException("Nem megfelelő hosszúság: " + word);
        }

        char[] characters = word.toCharArray();
        for (char c: characters) {
            if (!Character.isAlphabetic(c)) {
                throw new IllegalArgumentException("Nem csak betűt tartalmaz: " + word);
            }
        }

        System.out.println("A megadott szó: " + word);
    }
}