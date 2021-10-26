package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {

        List<Dog> listOfDogs = new ArrayList<>();
        Dog dog1 = new Dog("Tóbiás", 2, "barna");
        Dog dog2 = new Dog("Morzsa", 8, "zsemle");
        Dog dog3 = new Dog("Pajti", 3, "fehér");
        listOfDogs.add(dog1);
        listOfDogs.add(dog2);
        listOfDogs.add(dog3);
        System.out.println(listOfDogs);

        Dog dog4 = listOfDogs.get(1);
        dog4.setColour("fekete");
        System.out.println(listOfDogs);

        Dog dog5 = new Dog("Samu", 4, "fekete");
        System.out.println(dog5);
        dog5 = listOfDogs.get(1);
        System.out.println(dog5);

        listOfDogs.add(dog5);
        System.out.println(listOfDogs);

        Dog dog6 = dog4;
        dog6.setColour("szürke");
        System.out.println(listOfDogs);

        List<Dog> list2 = listOfDogs;
        Dog dog7 = dog4;
        dog7.setColour("csoki");
        System.out.println(list2);

        dog2.setColour("vörös");
        System.out.println(list2);

        dog2 = null; //csak a dog2 változó nem fog már az objektumra mutatni, de a listában tárolt referencia megmarad
        System.out.println(list2);

        Dog dog8 = listOfDogs.get(1);
        dog8 = null;
        System.out.println(list2);

        Dog dog9 = listOfDogs.get(1);
        dog9.setColour("zsemle");
        System.out.println(list2);
    }
}