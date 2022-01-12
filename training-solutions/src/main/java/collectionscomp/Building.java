package collectionscomp;


import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

    private String address;
    private double area;
    private int level;

    public Building(String address, double area, int level) {
        this.address = address;
        this.area = area;
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public int compareTo(Building o) {
        return this.level - o.level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return level == building.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(level);
    }

    @Override
    public String toString() {
        return "Cím: " + address + ", terület: " + area +
                ", szintek: " + level + "\n";
    }



    public static void main(String[] args) {

        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Fő út 15.", 1546.23, 14));
        buildings.add(new Building("Fő út 12.", 659.11, 8));
        buildings.add(new Building("Fő út 17.", 714.46, 4));
        buildings.add(new Building("Fő út 3.", 156.23, 2));

        System.out.println(buildings);
    }
}
