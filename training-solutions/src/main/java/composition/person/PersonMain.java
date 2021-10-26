package composition.person;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person("Tamás Tóth", "123654HA");
        Address address = new Address("Hungary", "Budapest", "Váci street 56.", "1132");
        System.out.println(person.personToString());
        person.moveTo(address);
        System.out.println(person.getAddress().addressToString());
        System.out.println();

        person.correctData("Tamás Tóth", "463894LG");
        person.getAddress().correctData("Hungary", "Szeged", "Szabadság square 7.", "6725");
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());
    }
}