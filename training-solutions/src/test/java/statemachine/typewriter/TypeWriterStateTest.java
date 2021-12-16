package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void testNext() {

        assertEquals(TypeWriterState.UPPER_CASE, TypeWriterState.LOWER_CASE.next());
        assertEquals(TypeWriterState.LOWER_CASE, TypeWriterState.UPPER_CASE.next());
    }
}