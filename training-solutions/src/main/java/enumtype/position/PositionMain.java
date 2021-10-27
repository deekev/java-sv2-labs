package enumtype.position;

public class PositionMain {

    public static void main(String[] args) {

        System.out.println(Position.TITKÁRNŐ + " bér: " + Position.TITKÁRNŐ.getSalary() + ", juttatás: " + Position.TITKÁRNŐ.getBenefit());
        System.out.println(Position.TAKARÍTÓ + " bér: " + Position.TAKARÍTÓ.getSalary() + ", juttatás: " + Position.TAKARÍTÓ.getBenefit());
    }
}