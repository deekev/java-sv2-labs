package introexceptionmoreexceptions;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person(null, 32);
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getName().toUpperCase());
    }
}
/*
NullPointerException: Cannot invoke "String.toUpperCase()" because the return value of
"introexceptionmoreexceptions.Person.getName()" is null
at introexceptionmoreexceptions.PersonMain.main(PersonMain.java:10)

toUpperCase() hívásánál keletkezik kivétel, mert null értékű változón nem hívhatunk metódust.
 */