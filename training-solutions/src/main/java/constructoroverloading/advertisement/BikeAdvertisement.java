package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {

    private String text;
    private int price;
    private List<String> extras;
    private String brand;
    private String serialNumber;

    public BikeAdvertisement(String text, int price) {
        this.text = text;
        this.price = price;
    }

    public BikeAdvertisement(String text, int price, String brand) {
        this(text, price);
        this.brand = brand;
    }

    public BikeAdvertisement(String text, int price, String brand, List<String> extras) {
        this(text, price, brand);
        this.extras = extras;
    }

    public BikeAdvertisement(String text, int price, String brand, List<String> extras, String serialNumber) {
        this(text, price, brand, extras);
        this.serialNumber = serialNumber;
    }

    public String getText() {
        return text;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getExtras() {
        return extras;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}