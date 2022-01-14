package sorting.webshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WebShop {

    private List<Product> products = new ArrayList<>();

    public void addProducts(Product product) {
        products.add(product);
    }

    public List<Product> getProductsOrderByName() {
        List<Product> ordered = new ArrayList<>(products);
        Collections.sort(ordered, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return ordered;
    }

    public List<Product> getProductsOrderByPrice() {
        List<Product> ordered = new ArrayList<>(products);
        Collections.sort(ordered, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return ordered;
    }

    public List<Product> getProductsOrderByDate() {
        List<Product> ordered = new ArrayList<>(products);
        Collections.sort(ordered, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });
        return ordered;
    }
}