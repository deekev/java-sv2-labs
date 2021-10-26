package composition.realestate;

public class RealEstateDotCom {

    public static void main(String[] args) {
        Address address = new Address("Eger", "3300", "Attila utca", 22);
        Details details = new Details("átlagos állapotú", address, 110, 500);
        RealEstate realEstate = new RealEstate("Családi ház", 38.3, details);

        System.out.println(realEstate);
    }
}