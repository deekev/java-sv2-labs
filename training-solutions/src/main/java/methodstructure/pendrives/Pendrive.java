package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public void risePrice(int percent) {
        price += price * (percent/100D);
    }

    public int comparePricePerCapacity(Pendrive other) {
        if (getPricePerCapacity() > other.getPricePerCapacity()) {
            return 1;
        }
        if (getPricePerCapacity() < other.getPricePerCapacity()) {
            return -1;
        }
        return 0;
    }

    public boolean isCheaperThan(Pendrive other) {
        return getPrice() < other.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("A pendrive adatai: \n");
        stringBuilder.append("Név: ")
                .append(name)
                .append("\nTárhely: ")
                .append(capacity)
                .append(" GB\nÁr: ")
                .append(price)
                .append(" Ft");
        return stringBuilder.toString();
    }

    private double getPricePerCapacity() {
        return price / (double) capacity;
    }
}