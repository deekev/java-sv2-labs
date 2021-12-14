package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {

    public static final long ALTITUDE = 5;

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public AstroBoy(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return position.getZ();
    }

    @Override
    public List<Point> getPath() {
        return new ArrayList<>(path);
    }

    @Override
    public void liftTo(long altitude) {
        position = new Point(position.getX(), position.getY(), altitude);
        addPositionToPath(position);
    }

    public void flyTo(Point position) {
        this.position = new Point(position.getX(), position.getY(), ALTITUDE);
        addPositionToPath(this.position);
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        flyTo(position);
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    private void addPositionToPath(Point position) {
        path.add(position);
    }

    private void walkTo(Point position) {
        addPositionToPath(position);
        this.position = position;
    }
}