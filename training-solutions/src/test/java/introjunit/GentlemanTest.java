package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test
    public void testSayHello() {
        assertThat(new Gentleman().sayHello("John Doe"), equalTo("HelloJohn Doe!"));
    }
}

/*
Rontsd el a tesztesetet, hogy hibás legyen, amire ellenőriz!
java.lang.AssertionError:
Expected: "HelloJohn Doe!"
     but: was "Hello John Doe!"
Expected :HelloJohn Doe!
Actual   :Hello John Doe!
 */