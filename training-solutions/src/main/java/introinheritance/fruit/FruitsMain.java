package introinheritance.fruit;

public class FruitsMain {

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.setName("barack");
        fruit.setWeight(13.6);

        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());

        Grape grape = new Grape();
        grape.setName("szőllő");
        grape.setWeight(11.5);
        grape.setType("Irsai Olivér");

        System.out.println(grape.getName());
        System.out.println(grape.getWeight());
        System.out.println(grape.getType());

        Apple apple = new Apple();
        apple.setName("alma");
        apple.setWeight(16.2);
        apple.setPieces(150);

        System.out.println(apple.getName());
        System.out.println(apple.getWeight());
        System.out.println(apple.getPieces());

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("Golden");
        goldenDelicious.setWeight(14.8);
        goldenDelicious.setPieces(100);

        System.out.println(goldenDelicious.getName());
        System.out.println(goldenDelicious.getWeight());
        System.out.println(goldenDelicious.getPieces());
        System.out.println(goldenDelicious.getColour());

        Starking starking = new Starking();
        starking.setName("Starking");
        starking.setWeight(13.8);
        starking.setPieces(75);

        System.out.println(starking.getName());
        System.out.println(starking.getWeight());
        System.out.println(starking.getPieces());
        System.out.println(starking.getColour());
    }

    /*
    példányosítsd le az összes osztályt (az enum kivételével, természetesen),
    valamint minden létrehozott példánynál állíts be minden attribútum értéket (setter metódusokkal),
    amit csak be tudsz állítani! Írj is ki minden beállított értéket a konzolra! Mit tapasztalsz?

    A leszármazott osztályok örökölték a szülő osztály attribútumait és metódusait,
    de fordítva ez nem igaz.
     */
}