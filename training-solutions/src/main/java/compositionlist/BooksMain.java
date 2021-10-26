package compositionlist;

import java.util.Scanner;

public class BooksMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Books books = new Books();

        System.out.println("Listában rögzítendő könyvek száma:");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Adja meg a könyv címét: ");
            books.addBook(scanner.nextLine());
        }
        System.out.println();
        System.out.println(books.getTitles());
        System.out.println();

        System.out.println("Adja meg hogy melyik könyv szerzőjét akarja rögzíteni: ");
        String bookToFind = scanner.nextLine();
        System.out.println("Adja meg könyv szerzőjét: ");
        String author = scanner.nextLine();
        books.findBookAndSetAuthor(bookToFind, author);
        System.out.println(books.getTitles());
    }
}