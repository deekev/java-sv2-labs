package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {

    public Book getFirstBook(List books) {
        if (books == null) {
            throw new NullPointerException("Argument should not be null!");
        }
        if (books.size() == 0) {
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        if (books.get(0) instanceof Book) {
            return (Book) books.get(0);
        } else {
            throw new ClassCastException("Not a book");
        }
    }
}