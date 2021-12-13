package interfacedependencyinversion.box;

public class CourierCompany {

    public static void main(String[] args) {

        Box smallBox = new SmallBox();
        System.out.println(smallBox.getSize());
        System.out.println(smallBox.getPrice());

        Box mediumBox = new MediumBox();
        System.out.println(mediumBox.getSize());
        System.out.println(mediumBox.getPrice());

        Box largeBox = new LargeBox();
        System.out.println(largeBox.getSize());
        System.out.println(largeBox.getPrice());

        Box extraLargeBox = new ExtraLargeBox();
        System.out.println(extraLargeBox.getSize());
        System.out.println(extraLargeBox.getPrice());
    }
}