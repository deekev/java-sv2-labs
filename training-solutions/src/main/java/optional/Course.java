package optional;

import java.util.Objects;

public class Course {

    private String name;
    private Level level;
    private int price;

    public Course(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public Course(String name, Level level, int price) {
        this(name, level);
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name) && level == course.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level);
    }
}