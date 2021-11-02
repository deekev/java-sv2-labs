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
        assertEquals("Hello JohnDoe!", greeting);
    }
}

/*
Rontsd el a tesztesetet, hogy hibás legyen, amire ellenőriz!
org.opentest4j.AssertionFailedError:
Expected :Hello JohnDoe!
Actual   :Hello John Doe!
Process finished with exit code -1
 */