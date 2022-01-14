package searching;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private int id;
    private String author;
    private String title;

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        if (this.author.compareTo(o.author) == 0) {
            return this.title.compareTo(o.title);
        }
        return this.author.compareTo(o.author);
    }

    @Override
    public String toString() {
        return id + " " + author + " " + title;
    }
}