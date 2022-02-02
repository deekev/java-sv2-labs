package contentsite;

import java.util.ArrayList;
import java.util.List;

public class Video implements Content {

    public static final int PREMIUM_LENGTH = 15;

    private String title;
    private int length;
    private List<User> users = new ArrayList<>();

    public Video(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean isPremiumContent() {
        return length > PREMIUM_LENGTH;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<User> clickedBy() {
        return new ArrayList<>(users);
    }

    @Override
    public void click(User user) {
        users.add(user);
    }
}
