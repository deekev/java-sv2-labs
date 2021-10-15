package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Az 1-es raktárban tárolt termék megnevezése:");
        Store storeOne = new Store(scanner.nextLine());
        System.out.println(storeOne.showStock());
        System.out.println();

        System.out.println(storeOne.getProduct() + " beszállított mennyisége:");
        storeOne.store(scanner.nextInt());
        scanner.nextLine();
        System.out.println(storeOne.showStock());
        System.out.println();

        System.out.println(storeOne.getProduct() + " kiszállítandő mennyisége:");
        storeOne.dispatch(scanner.nextInt());
        scanner.nextLine();
        System.out.println(storeOne.showStock());
        System.out.println();

        System.out.println("A 2-es raktárban tárolt termék megnevezése:");
        Store storeTwo = new Store(scanner.nextLine());
        System.out.println(storeTwo.showStock());
        System.out.println();

        System.out.println(storeTwo.getProduct() + " beszállított mennyisége:");
        storeTwo.store(scanner.nextInt());
        scanner.nextLine();
        System.out.println(storeTwo.showStock());
        System.out.println();

        System.out.println(storeTwo.getProduct() + " kiszállítandő mennyisége:");
        storeTwo.dispatch(scanner.nextInt());
        scanner.nextLine();
        System.out.println(storeTwo.showStock());
        System.out.println();

    }
}
