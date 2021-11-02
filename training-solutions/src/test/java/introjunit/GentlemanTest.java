package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test
    public void testSayHelloName() {
        assertThat(new Gentleman().sayHello("John Doe"), equalTo("Hello John Doe!"));
    }

    @Test
    public void testSayHelloNull() {
        assertThat(new Gentleman().sayHello(null), equalTo("Hello Anonymus!"));
    }
}

/*
Futtasd le a tesztlefedettség mérést, és nézd meg,
hogy hogyan jelzi a fejlesztőeszköz, hogy az új ág nem lett lefedve!
Line, % --> 75% (3/4)

Implementáld a megfelelő tesztesetet és futtasd le újra a lefedettség mérést!
Line, % --> 100% (4/4)
 */