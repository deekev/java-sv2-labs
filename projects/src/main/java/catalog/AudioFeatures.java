package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private String title;
    private int length;
    private List<String> performers;
    private List<String> composers = new ArrayList<>();

    public AudioFeatures(String title, int length, List<String> performers) {
        checkConstructorParameters(title, length, performers);
        this.title = title;
        this.length = length;
        this.performers = performers;
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composers) {
        this(title, length, performers);
        if (Validators.isEmpty(composers)) {
            throw new IllegalArgumentException("List can't be empty or null.");
        }
        this.composers = composers;
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        contributors.addAll(composers);
        contributors.addAll(performers);
        return contributors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    private void checkConstructorParameters(String title, int length, List<String> performers) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Title can't be empty string or null.");
        }
        if (length <= 0) {
            throw new IllegalArgumentException("Lenght must be greater than 0.");
        }
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("List can't be empty or null.");
        }
    }
}