package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();

        System.out.println("Üdvözöljük oldalunkun!");
        System.out.println("Regisztrációhoz adja meg adatait:");

        System.out.println("Név:");
        String name = scanner.nextLine();
        boolean isNameValid = false;

        try {
            validation.validateName(name);
            isNameValid = true;
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println("Kor:");
        String age = scanner.nextLine();
        boolean isAgeValid = false;

        try{
            validation.validateAge(age);
            isAgeValid = true;
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println("Őn az alábbi adatokat adta meg:");
        System.out.println("Név: " + name);
        System.out.println("Kor: " + age);

        if (isNameValid && isAgeValid) {
            System.out.println("A regisztráció sikeres.");
        }
        else {
            System.out.println("Sikertelen regisztráció.");
        }
    }
}