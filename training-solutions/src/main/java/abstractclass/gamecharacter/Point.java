package abstractclass.gamecharacter;

public class Point {

    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long getDistance(Point anotherPoint) {
        double aPow = Math.pow(Math.abs(this.x - anotherPoint.x), 2.0);
        double bPow = Math.pow(Math.abs(this.y - anotherPoint.y), 2.0);
        return (long) Math.sqrt(aPow + bPow);
    }
}