package introexceptionthrowjunit5;

public class Tank {

    private int angle;

    public void modifyAngle(int angleNumber) {
        angle += angleNumber;

        if (angle > 360) {
            angle -= 360;
        }
        else if (angle < 0) {
            angle += 360;
        }

        if (angle > 80 && angle < 280) {
            throw new IllegalArgumentException("A fordulás szöge nem eshet 80° és 280° közé!");
        }
    }

    public int getAngle() {
        return angle;
    }
}