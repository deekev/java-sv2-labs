package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        new Book(); // nem tudunk rá hivatkozni

        System.out.println(new Book()); // memóriában létrjött objektumra mutató referencia

        // Book emptyBook; hibát ad, mert kezdő értéket kell kapnia

        Book emptyBook = null;
        System.out.println(emptyBook);
        if (emptyBook == null){
            System.out.println("emptyBook is null");
        }

        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(book == anotherBook);


        // A következő kód hány objektumot hoz létre? A futás végére mennyi objektumhoz lehet hozzáférni?
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);
        System.out.println(book6);
        System.out.println(book7);
        // 5 (new Book()) különböző objektum jön létre a memóriában, ebből a végén 3-ra tudunk hivatkozni



        Book[] arrayOfBooks = {new Book(), new Book(), new Book()};
        System.out.println(arrayOfBooks);

        List<Book> listOfBooks = Arrays.asList(new Book(), new Book(), new Book());
        System.out.println(listOfBooks);

        List<Book> anotherList = new ArrayList<>();
        anotherList.add(new Book());
        anotherList.add(new Book());
        anotherList.add(new Book());
        System.out.println(anotherList);

    }
}