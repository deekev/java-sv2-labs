package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserValidator validator = new UserValidator();

        System.out.println("Adja meg a felhasználónevet:");
        String username = scanner.nextLine();

        System.out.println("Adja meg a jelszót:");
        String password1 = scanner.nextLine();

        System.out.println("Adja meg a jelszót újra:");
        String password2 = scanner.nextLine();

        System.out.println("Adja meg az e-mail címet:");
        String email = scanner.nextLine();

        System.out.println(validator.isValidUsername(username) ? "Felhasználónév helyes." : "Helytelen felhasználónév.");
        System.out.println(validator.isValidPassword(password1, password2) ? "Jelszó helyes." : "Helytelen jelszó.");
        System.out.println(validator.isValidEmail(email) ? "E-mail cím helyes." : "Helytelen e-mail cím.");

    }
}
