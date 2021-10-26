package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person person1;
        Person person2;
        person1 = new Person("John", 1992);
        person2 = person1;
        person2.setName("Jack");
        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());
        System.out.println(person1 == person2);
        // A person1 és a person2 változó is ugyanarra az objektumra mutat a heapben.


        int number1 = 24;
        int number2 = number1;
        number2++;
        System.out.println(number1);
        System.out.println(number2);
        /* A number2 változónak maga az érték adódott át (mivel az int primitív típus), ezért
           annak növelése nem volt hatással a number 1 változóban tárolt értékre. */

        Person person3 = new Person("Jane", 1996);
        person2 = person3;
        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());
        System.out.println(person3.getName() + " " + person3.getAge());
        /* A person2 változó már nem ugyanarra az objektumra tartalmaz referenciát, mint a person1,
           hanem mint a person3. */
    }
}