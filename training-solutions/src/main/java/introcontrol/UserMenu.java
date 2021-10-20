package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userList = "1. Felhasználók listázása";
        String userAdd = "2. Felhasználó felvétele";
        String other = "Többi: Kilépés";

        System.out.println("Válasszon a menüpontok közül:");
        System.out.println(userList);
        System.out.println(userAdd);
        System.out.println(other);

        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println(userList);
        } else if (number == 2){
            System.out.println(userAdd);
        }
    }
}
