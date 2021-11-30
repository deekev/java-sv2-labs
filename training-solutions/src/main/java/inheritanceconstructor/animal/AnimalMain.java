package inheritanceconstructor.animal;

public class AnimalMain {

    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
    }

    /*
    Mit látsz a konzolon a main() metódus lefuttatása után?

    Animal class constructor
    Bird class constructor
    Sparrow class constructor
    Mivel minden osztály példányosításakor lefut az ős konstruktora is.
     */
}