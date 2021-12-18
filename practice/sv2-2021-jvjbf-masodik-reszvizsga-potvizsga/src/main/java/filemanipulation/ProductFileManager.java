package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ProductFileManager {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public void readProductsFromFile(Path path) {
        try {
            products = createProductList(Files.readAllLines(path));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public void writePriceOverToFile(Path path, int price) {
        try {
            Files.write(path, findProductsOverPrice(price));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can't write file!", ioe);
        }
    }

    private List<Product> createProductList(List<String> lines) {
        List<Product> result = new ArrayList<>();
        for (String s: lines) {
            String[] temp = s.split(";");
            result.add(new Product(temp[0], temp[1], Integer.parseInt(temp[2])));
        }
        return result;
    }

    private List<String> findProductsOverPrice(int price) {
        List<String> result = new ArrayList<>();
        for (Product p: products) {
            if (p.getPrice() > price) {
                result.add(p.toString());
            }
        }
        return result;
    }
}