package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("What's your favourite song?");
        System.out.println("Give me your answers.");
        System.out.println();
        System.out.println("Artist:");
        song.band = scanner.nextLine();

        System.out.println("Title of the song:");
        song.title = scanner.nextLine();

        System.out.println("Song's length in minutes:");
        song.length = scanner.nextInt();

        System.out.println();
        System.out.println("Your favourite song is:");
        System.out.println(song.band + " - " + song.title + " (" + song.length + " minutes)");


    }
}
