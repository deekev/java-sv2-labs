package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GentlemanTest {

    @Test
    void testGreetingWithName() {
        //Given
        String name = "John Doe";

        //When
        String greeting = new Gentleman().sayHello(name);

        //Then
        assertEquals("Hello John Doe!", greeting);
    }

    @Test
    void testGreetingWithNull() {
        String name = null;
        String greeting = new Gentleman().sayHello(name);
        assertEquals("Hello Anonymus!", greeting);
    }
}

/*
Futtasd le a tesztlefedettség mérést, és nézd meg,
hogy hogyan jelzi a fejlesztőeszköz, hogy az új ág nem lett lefedve!
Line, % --> 75% (3/4)

Implementáld a megfelelő tesztesetet és futtasd le újra a lefedettség mérést!
Line, % --> 100% (4/4)
 */