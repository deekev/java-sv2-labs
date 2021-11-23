package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Movie> getMovieInCategoryWithRatingAboveThree(Category category) {
        List<Movie> result = new ArrayList<>();
        for (Movie actual: movies) {
            if (actual.getCategory().equals(category) && actual.getRating() > 3) {
                result.add(actual);
            }
        }
        return result;
    }
}