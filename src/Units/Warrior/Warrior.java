package Units.Warrior;

import Units.BaseHero;

public class Warrior extends BaseHero {

    protected int resistance, ultimateDamage;

    public Warrior(int hp, int maxHp, int armor, int damage, int stamina, int lvl, int resistance, int ultimateDamage) {
        super(hp, maxHp, armor, damage, stamina, lvl);
        this.resistance = resistance;
        this.ultimateDamage = ultimateDamage;
    }
}