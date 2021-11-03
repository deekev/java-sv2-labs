package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WithoutAccentsTest {

    @Test
    void testConvertToCharWithoutAccents() {
        WithoutAccents withoutAccents = new WithoutAccents();
        assertEquals('a', withoutAccents.convertToCharWithoutAccents('á'));
        assertEquals('A', withoutAccents.convertToCharWithoutAccents('A'));
        assertEquals('e', withoutAccents.convertToCharWithoutAccents('é'));
        assertEquals('i', withoutAccents.convertToCharWithoutAccents('í'));
        assertEquals('o', withoutAccents.convertToCharWithoutAccents('ó'));
        assertEquals('O', withoutAccents.convertToCharWithoutAccents('Ö'));
        assertEquals('o', withoutAccents.convertToCharWithoutAccents('ő'));
        assertEquals('u', withoutAccents.convertToCharWithoutAccents('ú'));
        assertEquals('u', withoutAccents.convertToCharWithoutAccents('ü'));
        assertEquals('U', withoutAccents.convertToCharWithoutAccents('Ű'));
    }
}