package primitivetypes.exam;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birth;
    private int zipCode;
    private double average;

    public Person(String name, LocalDate birth, int zipCode, double average) {
        this.name = name;
        this.birth = birth;
        this.zipCode = zipCode;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Név: " + name +"\n" +
                "Születési idő: " + birth + "\n" +
                "Irányítószám: " + zipCode + "\n" +
                "Átlag: " + average;
    }
}