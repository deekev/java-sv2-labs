package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint = 100;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }

    public abstract void secondaryAttack(Character enemy);

    protected int getActualPrimaryDamage() {
       return random.nextInt(1,10);
    }

    protected void hit(Character enemy, int damage) {
        if (enemy.getActualDefence() < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    private int getActualDefence() {
        return random.nextInt(1, 5);
    }

    private void decreaseHitPoint(int diff) {
        if (hitPoint - diff >= 0) {
            hitPoint -= diff;
        } else {
            hitPoint = 0;
        }
    }
}