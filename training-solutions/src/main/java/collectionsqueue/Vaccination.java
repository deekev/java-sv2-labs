package collectionsqueue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> ages = new PriorityQueue<>();
        for (Person p: people) {
            if (p.getAge() >= 18 && p.getAge() <= 65) {
                ages.add(p.getAge());
            }
        }
        return ages;
    }

    public static void main(String[] args) {

        Vaccination vaccination = new Vaccination();
        List<Person> people = Arrays.asList(
                new Person ("Kiss József", 66),
                new Person ("Nagy Béla", 45),
                new Person ("Szép Virág", 17),
                new Person ("Németh Luca", 18),
                new Person ("Szabó László", 65),
                new Person ("Kiss József", 31),
                new Person ("Kovács Mária", 11));

        Queue<Integer> ages = vaccination.getVaccinationOrder(people);
        System.out.println(ages);

        System.out.println(ages.poll());
        System.out.println(ages.poll());
        System.out.println(ages.poll());
        System.out.println(ages.poll());
    }
}