package algorithmsfilter.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

    VideoTheque videoTheque = new VideoTheque();

    @BeforeEach
    void init() {
        videoTheque.addMovie(new Movie("Bosszúállók", Category.AKCIÓ, 5));
        videoTheque.addMovie(new Movie("Frozen", Category.ANIMÁCIÓ, 4));
        videoTheque.addMovie(new Movie("Oroszlánkirály", Category.ANIMÁCIÓ, 5));
        videoTheque.addMovie(new Movie("Garfield", Category.ANIMÁCIÓ, 2));
        videoTheque.addMovie(new Movie("Shrek", Category.ANIMÁCIÓ, 5));
        videoTheque.addMovie(new Movie("Mission: Impossible", Category.AKCIÓ, 5));
    }

    @Test
    void testGetMovieInCategoryWithRatingAboveThree() {
        List<Movie> result = videoTheque.getMovieInCategoryWithRatingAboveThree(Category.ANIMÁCIÓ);

        assertEquals(3, result.size());
        assertEquals("Shrek", result.get(2).getTitle());
    }
}