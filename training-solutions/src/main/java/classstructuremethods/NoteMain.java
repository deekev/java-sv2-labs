package classstructuremethods;

import java.util.Scanner;

public class NoteMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Note note = new Note();

        System.out.println("Write your comment here:");
        System.out.println();

        System.out.println("Username:");
        note.setName(scanner.nextLine());

        System.out.println("Topic:");
        note.setTopic(scanner.nextLine());

        System.out.println("Text:");
        note.setText(scanner.nextLine());

        System.out.println();
        System.out.println("Your comment has been sent successfully.");
        System.out.println();
        System.out.println(note.getNoteText());

    }
}
