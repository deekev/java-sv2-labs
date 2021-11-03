package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingsTest {

    @Test
    void testGreetAccordingToTime() {
        Greetings greeting = new Greetings();
        assertEquals("Jó reggelt!", greeting.greetAccordingToTime(5,1));
        assertEquals("Jó reggelt!", greeting.greetAccordingToTime(9,0));
        assertEquals("Jó napot!", greeting.greetAccordingToTime(9,1));
        assertEquals("Jó napot!", greeting.greetAccordingToTime(18,30));
        assertEquals("Jó estét!", greeting.greetAccordingToTime(18,31));
        assertEquals("Jó estét!", greeting.greetAccordingToTime(20,0));
        assertEquals("Jó éjt!", greeting.greetAccordingToTime(20,1));
        assertEquals("Jó éjt!", greeting.greetAccordingToTime(5,0));
    }
}