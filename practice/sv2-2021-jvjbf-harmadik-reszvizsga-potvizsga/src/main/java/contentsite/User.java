package contentsite;

public class User {

    private String userName;
    private int password;
    private boolean logIn;
    private boolean premiumMember;

    public User(String userName, String password) {
        this.userName = userName;
        String passHash = userName + password;
        this.password = passHash.hashCode();
    }

    public String getUserName() {
        return userName;
    }

    public int getPassword() {
        return password;
    }

    public boolean isLogIn() {
        return logIn;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void upgradeForPremium() {
        premiumMember = true;
    }

    public void setLogIn(boolean value) {
        logIn = value;
    }
}
