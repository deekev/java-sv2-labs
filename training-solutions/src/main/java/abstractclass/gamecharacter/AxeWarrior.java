package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character {

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    public int getActualSecondaryDamage() {
        return (int)(Math.random() * 2 * super.getActualPrimaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if (getPosition().getDistance(enemy.getPosition()) < 2) {
            super.hit(enemy, getActualSecondaryDamage());
        }
    }
}