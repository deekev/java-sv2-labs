package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {

    private int numberOfArrow;

    public Archer(Point position, Random random) {
        super(position, random);
        this.numberOfArrow = 100;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }

    private int getActualSecondaryDamage() {
        return super.getRandom().nextInt(1, 5);
    }

    private void shootingAnArrow(Character enemy) {
        if (numberOfArrow > 0) {
            numberOfArrow--;
            super.hit(enemy, getActualSecondaryDamage());
        }
    }
}