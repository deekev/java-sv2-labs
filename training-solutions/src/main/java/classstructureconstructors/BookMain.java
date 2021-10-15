package classstructureconstructors;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the new book to the database:");
        System.out.println("Author:");
        String author = scanner.nextLine();

        System.out.println("Title:");
        String title = scanner.nextLine();

        Book book = new Book(author, title);

        System.out.println("Registration number:");
        book.register(scanner.nextLine());

        System.out.println();
        System.out.println("Book database has been updated:");
        System.out.println(book.dataChecker());

    }
}
