package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a termék nevét:");
        String nameOfProduct = scanner.nextLine();

        System.out.println("Adja meg a termék árát:");
        int priceOfProduct = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(nameOfProduct, priceOfProduct);

        System.out.println();
        System.out.println("A termék rögzítésre került.");
        System.out.println(product.showNameAndPrice());

        System.out.println();
        System.out.println("Amennyiben növelni kívánja az árat, adja meg a növelés mértékét:");
        product.increasePrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println(product.showNameAndPrice());

        System.out.println();
        System.out.println("Amennyiben csökkenteni kívánja az árat, adja meg a csökkentés mértékét:");
        product.decreasePrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println(product.showNameAndPrice());
    }
}
