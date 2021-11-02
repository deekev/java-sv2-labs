package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void testGreeting() {
        //Given
        Gentleman gentleman = new Gentleman();

        //When
        String greeting = gentleman.sayHello("John Doe");

        //Then
        assertEquals("Hello John Doe!", greeting);
    }
}

/*
Rontsd el először a programot, hogy hibás üzenetet adjon vissza!
org.opentest4j.AssertionFailedError:
Expected :Hello John Doe!
Actual   :HelloJohn Doe!
Process finished with exit code -1
 */