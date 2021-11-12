package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();
        Fish clownFish = new Fish("Clown Fish", "orange-white");
        Fish goldFish = new Fish("Gold Fish", "golden");
        Fish koiFish = new Fish("Koi", "golden-white");
        aquarium.addFish(clownFish);
        aquarium.addFish(goldFish);
        aquarium.addFish(koiFish);

        aquarium.getNumberOfFish();
    }
}

/*
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.List.add(Object)"
because "this.ornamentalFish" is null
	at introexceptiontrace.aquarium.Aquarium.addFish(Aquarium.java:14)
	at introexceptiontrace.aquarium.AquariumMain.main(AquariumMain.java:11)

Mivel az Aquarium osztályban a <List> ornamentalFish attribútum sem helyben,
sem konstruktorban nincs inicializálva, így nem mutat egy objektumra, hanem null értéket kap.
Ezért mikor az AquariumMain osztály main() metódusa a 11. sorban meghívja
az Aquarium osztály add() metódusát a 14. sorban, NullPointerException-t dob.
 */
