package inheritanceattributes.building;

public class BuildingMain {

    public static void main(String[] args) {

        Building building = new Building("bank", 1523.56, 5);
        SchoolBuilding schoolBuilding = new SchoolBuilding("iskola", 2478.47, 4, 34);

        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}