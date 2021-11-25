package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {

    HikingTour hikingTour = new HikingTour();

    @Test
    void testLogFieldPoints() {
        hikingTour.logFieldPoints(LocalDateTime.of(2021, 11, 20, 14, 5),
                new FieldPoint(LocalDateTime.of(2021, 11, 20, 12, 12), 47.205902, 17.555667),
                new FieldPoint(LocalDateTime.of(2021, 11, 20, 12, 24), 47.212332, 17.565437),
                new FieldPoint(LocalDateTime.of(2021, 11, 20, 12, 24), 47.225752, 17.542887));

        assertEquals(3, hikingTour.getFieldPoints().size());
        assertEquals(LocalDateTime.of(2021, 11, 20, 14, 5), hikingTour.getFieldPoints().get(1).getTimeOfLogging());
        assertEquals(47.225752, hikingTour.getFieldPoints().get(2).getLatitude());
    }

    @Test
    void testLogFieldPointsWithNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> hikingTour.logFieldPoints(null,
                new FieldPoint(LocalDateTime.of(2021, 11, 20, 12, 12), 47.205902, 17.555667)));

        assertEquals("Time of logging is missing.", exception.getMessage());
    }
}