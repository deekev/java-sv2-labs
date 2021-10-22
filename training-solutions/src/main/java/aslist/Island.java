package aslist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mi lenne az a 3 dolog, amit magaddal vinnél egy lakatlan szigetre?");
        System.out.println("1. :");
        String firstThing = scanner.nextLine();
        System.out.println("2. :");
        String secondThing = scanner.nextLine();
        System.out.println("3. :");
        String thirdThing = scanner.nextLine();
        System.out.println();

        List<String> importantThings = Arrays.asList(firstThing, secondThing, thirdThing);

        System.out.println("Ezt a három dolgot vinnéd:");
        for (String i: importantThings){
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Még cserélhetsz egyet.");
        System.out.println("Melyiket cseréled:");
        String replacement = scanner.nextLine();
        int index = importantThings.indexOf(replacement);
        System.out.println("Mire cseréled:");
        importantThings.set(index, scanner.nextLine());
        System.out.println();

        System.out.println("Végleges listád:");
        for (String i: importantThings){
            System.out.println(i);
        }
    }
}