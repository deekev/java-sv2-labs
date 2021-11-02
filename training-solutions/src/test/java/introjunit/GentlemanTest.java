package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test
    public void testSayHello() {
        assertThat(new Gentleman().sayHello("John Doe"), equalTo("Hello John Doe!"));
    }
}

/*
Rontsd el először a programot, hogy hibás üzenetet adjon vissza!
java.lang.AssertionError:
Expected: "Hello John Doe!"
     but: was "HelloJohn Doe!"
Expected :Hello John Doe!
Actual   :HelloJohn Doe!
 */