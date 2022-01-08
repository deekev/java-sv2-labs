package collectionsequalshash;

import java.util.Objects;

public class Person {

    private String name;
    private  int age;
    private String socialSecurityNumber;

    public Person(String name, int age, String socialSecurityNumber) {
        this.name = name;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(socialSecurityNumber, person.socialSecurityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialSecurityNumber);
    }

    public static void main(String[] args) {

        Person person = new Person("John Doe", 1990, "092156423");
        Person anotherPerson = new Person("Jack Black", 1975, "092156423");

        System.out.println(person.equals(anotherPerson));
        System.out.println(person.hashCode());
        System.out.println(anotherPerson.hashCode());
    }
}