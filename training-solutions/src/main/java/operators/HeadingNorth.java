package operators;

public class HeadingNorth {

    public int getNumberOfNewDirections() {
        int circle = 360;
        int count = 0;
        for (int i = 0; i < circle; i += 10) {
            circle -= i;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {

        System.out.println(new HeadingNorth().getNumberOfNewDirections());
    }
}