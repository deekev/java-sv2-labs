package introexceptiontrace.numbers;

import java.util.Arrays;

public class NumbersMain {

    public static void main(String[] args) {

        Change change = new Change();
        System.out.println(Arrays.toString(change.changeNumbers()));
    }
}
/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
	at introexceptiontrace.numbers.RandomOperations.getNumbers(RandomOperations.java:13)
	at introexceptiontrace.numbers.Change.changeNumbers(Change.java:6)
	at introexceptiontrace.numbers.NumbersMain.main(NumbersMain.java:10)

	Mivel a RandomOperations osztály getNumbers() metódusában a for ciklus fetételben
	a ciklusváltozó (< helyett) <= lehet a bejárt tömb hosszával, ezért a ciklus utolsó futásakor
	túlindexelés történik.
 */