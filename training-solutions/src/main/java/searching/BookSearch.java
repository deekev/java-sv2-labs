package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookSearch {

    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if (isEmpty(author) || isEmpty(title)) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
        int index = Collections.binarySearch(books, new Book(author, title));
        if (index >= 0) {
            return books.get(index);
        } else {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
    }

    private boolean isEmpty(String s) {
        return s == null || s.isBlank();
    }
}
