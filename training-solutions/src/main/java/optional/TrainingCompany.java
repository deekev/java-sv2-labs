package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainingCompany {

    private List<Course> courses;

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> course = Optional.empty();
        for (Course actual: courses) {
            if (actual.getPrice() <= maxPrice) {
                course = Optional.of(actual);
            }
        }
        return course.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        Optional<Integer> course = Optional.empty();
        for (Course actual: courses) {
            if (actual.equals(new Course(name, level))) {
                course = Optional.of(actual.getPrice());
            }
        }
        return course.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public String getNameOfCourseWithGivenLevel(Level level) {
        Optional<String> course = Optional.empty();
        for (Course actual: courses) {
            if (actual.getLevel() == level) {
                course = Optional.of(actual.getName());
            }
        }
        return course.orElse("Sorry, there is no course at this level.");
    }
}