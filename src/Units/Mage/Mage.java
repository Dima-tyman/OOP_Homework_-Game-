package Units.Mage;

import Units.BaseHero;

public class Mage extends BaseHero {

    protected int mana, maxMana;

    public Mage(int hp, int maxHp, int armor, int damage, int stamina, int lvl, int mana, int maxMana) {
        super(hp, maxHp, armor, damage, stamina, lvl);
        this.mana = mana;
        this.maxMana = maxMana;
    }
}