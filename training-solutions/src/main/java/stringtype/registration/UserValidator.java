package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername (String username) {
        return username.length() > 0;
    }

    public boolean isValidPassword (String password1, String password2) {
        return password1.length() >= 8 && password1.equals(password2);
    }

    public boolean isValidEmail (String email) {
        return email.indexOf("@") >= 1 && email.indexOf(".") > email.indexOf("@") + 1 && email.indexOf(".") < email.length() - 1;
    }
}
