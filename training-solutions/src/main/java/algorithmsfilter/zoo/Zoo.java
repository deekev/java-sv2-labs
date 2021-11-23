package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<Animal> result = new ArrayList<>();
        for (Animal actual: animals) {
            if (actual.getNumberOfLegs() == numberOfLegs) {
                result.add(actual);
            }
        }
        return result;
    }
}