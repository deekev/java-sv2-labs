package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {

        List<String> favouriteThings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kedvenc szín:");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Kedvenc állat:");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Kedvenc étel:");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Kedvenc könyv:");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Kedvenc film:");
        favouriteThings.add(scanner.nextLine());
        System.out.println();

        System.out.println(favouriteThings.size());
        for (String i: favouriteThings){
            System.out.println(i);
        }
    }
}