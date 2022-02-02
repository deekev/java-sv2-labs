package contentsite;

import java.util.HashSet;
import java.util.Set;

public class ContentService {

    private Set<User> users = new HashSet<>();
    private Set<Content> contents = new HashSet<>();

    public Set<User> getAllUsers() {
        return new HashSet<>(users);
    }

    public Set<Content> getAllContent() {
        return new HashSet<>(contents);
    }

    public void registerUser(String name, String password) {
        if (isUserInSet(name)) {
            throw new IllegalArgumentException("Username is already taken: " + name);
        } else {
            users.add(new User(name, password));
        }
    }

    public void addContent(Content content) {
        if (isContentInSet(content)) {
            throw new IllegalArgumentException("Content name is already taken: " + content.getTitle());
        } else {
           contents.add(content);
        }
    }

    public void logIn(String username, String password) {
        if (!isUserInSet(username)) {
            throw new IllegalArgumentException("Username is wrong!");
        }
        User user = findUser(username);
        int actualPassword = (username + password).hashCode();
        if (user.getPassword() != actualPassword) {
            throw new IllegalArgumentException("Password is Invalid!");
        }
        user.setLogIn(true);
    }

    public void clickOnContent(User user, Content content) {
        if (!user.isLogIn()) {
            throw new IllegalStateException("Log in to watch this content!");
        }
        if (content instanceof Video && ((Video) content).getLength() > Video.PREMIUM_LENGTH && !user.isPremiumMember()) {
            throw new IllegalStateException("Upgrade for Premium to watch this content!");
        }
        content.click(user);
    }

    private boolean isUserInSet(String username) {
        return users.stream()
                .anyMatch(user -> username.equals(user.getUserName()));
    }

    private boolean isContentInSet(Content content) {
        return contents.stream()
                .anyMatch(con -> content.getTitle().equals(con.getTitle()));
    }

    private User findUser(String username) {
        return users.stream()
                .filter(user -> user.getUserName().equals(username))
                .findFirst().get();
    }
}

