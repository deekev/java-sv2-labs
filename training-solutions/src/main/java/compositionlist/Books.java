package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> titles = new ArrayList<>();

    public void addBook(String title) {
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        int index = titles.indexOf(title);
        if (index > -1) {
            titles.set(index, author + ": " + title);
        }
    }

    public List<String> getTitles() {
        return titles;
    }
}