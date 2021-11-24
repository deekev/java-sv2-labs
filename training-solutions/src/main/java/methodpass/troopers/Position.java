package methodpass.troopers;

public class Position {

    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("Position can not be null.");
        }
        double diffX = posX - position.posX;
        double diffY = posY - position.posY;
        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}