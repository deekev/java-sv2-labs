package classstructureintegrate;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int increasePrice(int price) {
        return this.price += price;
    }

    public int decreasePrice(int price) {
        return this.price -= price;
    }

    public String showNameAndPrice() {
        return name + " aktuális ára " + price + " Ft.";
    }

}
