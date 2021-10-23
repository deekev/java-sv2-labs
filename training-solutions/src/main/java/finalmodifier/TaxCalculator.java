package finalmodifier;

public class TaxCalculator {

    public static final double TAX = 27.0;

    public double tax(double price){
        return price * (TAX / 100);
    }

    public double priceWithTax(double price){
        return price + tax(price);
    }


    public static void main(String[] args) {

        double price = 20000;
        System.out.println(new TaxCalculator().tax(price));
        System.out.println(new TaxCalculator().priceWithTax(price));
    }
}