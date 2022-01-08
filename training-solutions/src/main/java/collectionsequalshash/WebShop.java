package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if (product == null) {
            throw new NullPointerException("Product can't be null!");
        }
        products.add(product);
    }

    public int findHowMany(Product product) {
        if (product == null) {
            throw new NullPointerException("Product can't be null!");
        }
        int count = 0;
        for (Product p: products) {
            if (product.equals(p)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        WebShop webShop = new WebShop();
        webShop.addProduct(new Product("jeans", "56985"));
        webShop.addProduct(new Product("t-shirt", "43679"));
        webShop.addProduct(new Product("skirt", "56985"));
        webShop.addProduct(new Product("sneaker", "67894"));
        webShop.addProduct(new Product("boots", "67894"));

        System.out.println(webShop.findHowMany(new Product("leggings", "56985")));
    }
}