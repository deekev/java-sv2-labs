package stringbasic.characters;

import java.util.Arrays;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a betűzendő szót:");
        String word = scanner.nextLine();
        System.out.println();

        char[] characters = new char[word.length()];
        System.out.println("Betűzze a megadott szót:" + word + "\nA többjegyű betűket írásjegyenként adja meg!");
        for (int i = 0; i < word.length(); i++) {
            System.out.println(i + 1 + ". betű:");
            characters[i] = scanner.nextLine().charAt(0);
        }
        System.out.println();
        System.out.println(Arrays.toString(characters));

        String spelledWord = new String(characters);
        System.out.println(spelledWord);

        if (word.equals(spelledWord)) {
            System.out.println("A megoldás helyes.");
        } else {
            System.out.println("A megoldás helytelen.");
        }
    }
}