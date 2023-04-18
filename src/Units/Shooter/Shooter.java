package Units.Shooter;

import Units.BaseHero;

public class Shooter extends BaseHero {

    protected int fireRate, accuracy;

    public Shooter(int hp, int maxHp, int armor, int damage, int stamina, int lvl, int fireRate, int accuracy) {
        super(hp, maxHp, armor, damage, stamina, lvl);
        this.fireRate = fireRate;
        this.accuracy = accuracy;
    }
}