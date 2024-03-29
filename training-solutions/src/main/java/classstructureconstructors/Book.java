package classstructureconstructors;

public class Book {

    private String author;
    private String title;
    private String regNumber;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void register(String regNumber) {
        this.regNumber = regNumber;
    }

    public String dataChecker() {
        return "Author: " + author + ", Title: " + title + ", Registration number: " + regNumber;
    }
}
