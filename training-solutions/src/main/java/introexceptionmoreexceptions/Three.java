package introexceptionmoreexceptions;

import java.util.Arrays;

public class Three {

    public static void main(String[] args) {

        int[] first = new int[]{3, 7, 24, 0, 466, 8, 0 ,42, 2, 6, 0};
        int[] second = new int[]{676, 4, 31, 5, 2, 432, 643, 0, 1, 42, 456};
        int[] third = new int[second.length];

        for (int i = 0; i < second.length; i++) {
            third[i] = first[i] / second[i];
            System.out.println(third[i]);
        }

        System.out.println(Arrays.toString(third));
    }
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at introexceptionmoreexceptions.Three.main(Three.java:14)

A ciklusban, a 14.sorban egy osztás történik, amiben a second tömb elemei az osztók.
A tömb 7. indexű eleme azonban 0, így mikor ezzel osztunk ArithmeticException kivételt kapunk.
 */