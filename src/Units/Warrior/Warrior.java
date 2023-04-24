package Units.Warrior;

import Units.BaseHero;

public abstract class Warrior extends BaseHero {

    protected int resistance, ultimateDamage;

    public Warrior(int hp, int maxHp, int armor, int damage, int lvl,
                   int resistance, int ultimateDamage, String name) {
        super(hp, maxHp, armor, damage, lvl, name);
        this.resistance = resistance;
        this.ultimateDamage = ultimateDamage;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", сопротивление: " + resistance + ", ульта: " + ultimateDamage + ".";
    }
}