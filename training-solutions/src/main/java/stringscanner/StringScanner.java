package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Írjon egy tetszőleges mondatot, ami legalább 3 tagmondatból áll.");
        System.out.println(sc1.nextLine());
        System.out.println();

        System.out.println("Írjon egy újabb mondatot, amely megfelel a korábbi feltételnek.");
        Scanner sc2 = new Scanner(sc1.nextLine()).useDelimiter(", ");
        while (sc2.hasNext()) {
            System.out.println(sc2.next());
        }
    }
}