package methodchain;

public class Grasshopper {

    private int position = 0;

    public int getPosition() {
        return position;
    }

    public Grasshopper hopOnce(Direction direction) {
        if (direction.equals(Direction.POSITIVE)) {
            position++;
        } else {
            position--;
        }
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops() {
        hopOnce(Direction.NEGATIVE)
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE);
    }
}