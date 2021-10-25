package attributes.book;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a könyv címét:");
        Book book = new Book(scanner.nextLine());
        System.out.println(book.getTitle());

        book.setTitle("Üvöltő szelek");
        System.out.println(book.getTitle());
    }
}