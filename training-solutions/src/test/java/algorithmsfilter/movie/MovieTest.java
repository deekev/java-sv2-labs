package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void testCreate() {
        Movie movie = new Movie("Bosszúállók", Category.AKCIÓ, 5);

        assertEquals("Bosszúállók", movie.getTitle());
        assertEquals(Category.AKCIÓ, movie.getCategory());
        assertEquals(5, movie.getRating());
    }
}