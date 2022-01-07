package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {

    private String title;
    private int numberOfPages;
    private List<String> authors;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        checkConstructorParameters(title, numberOfPages, authors);
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    @Override
    public List<String> getContributors() {
        return new ArrayList<>(authors);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    private void checkConstructorParameters(String title, int numberOfPages, List<String> authors) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("Number of pages must be greater than 0.");
        }
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException("List can't be empty or null.");
        }
    }
}