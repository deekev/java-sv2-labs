package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LabelsTest {

    @Test
    void getTableOfNumbers () {
        Labels labels = new Labels();
        int[][] table = labels.getTableOfNumbers(3);
        assertEquals(4, table[1][1]);
        assertEquals(6, table[2][2]);
    }
}