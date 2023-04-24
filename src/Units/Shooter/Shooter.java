package Units.Shooter;

import Units.BaseHero;

public abstract class Shooter extends BaseHero {

    protected int fireRate, accuracy;

    public Shooter(int hp, int maxHp, int armor, int damage, int lvl,
                   int fireRate, int accuracy, String name) {
        super(hp, maxHp, armor, damage, lvl, name);
        this.fireRate = fireRate;
        this.accuracy = accuracy;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", скорострельность: " + fireRate + ", точность: " + accuracy + ".";
    }
}