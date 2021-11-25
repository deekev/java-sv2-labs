package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void tesModify() {
        assertEquals("AxMy", new ModifiedWord().modify("almafa"));
        assertEquals("KxRy", new ModifiedWord().modify("körte"));
        assertEquals("SxIy", new ModifiedWord().modify("szilva"));
    }

}