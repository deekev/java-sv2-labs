package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void testCreate() {
        TableCloth tableCloth = new TableCloth(15.36);

        assertEquals(15.36, tableCloth.getSide());
    }

    @Test
    void testGetNumberOfSides() {
        TableCloth tableCloth = new TableCloth(15.36);

        assertEquals(4, tableCloth.getNumberOfSides());
    }

    @Test
    void testGetLengthOfDiagonal() {
        TableCloth tableCloth = new TableCloth(10.0);

        assertEquals(14.142, tableCloth.getLengthOfDiagonal(), 0.005);
    }

    @Test
    void testGetPerimeter() {
        TableCloth tableCloth = new TableCloth(10.0);

        assertEquals(40.0, tableCloth.getPerimeter());
    }

    @Test
    void testGetArea() {
        TableCloth tableCloth = new TableCloth(10.0);

        assertEquals(100.0, tableCloth.getArea());
    }
}