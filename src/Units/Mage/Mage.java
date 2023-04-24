package Units.Mage;

import Units.BaseHero;

public abstract class Mage extends BaseHero {

    protected int mana, maxMana;

    public Mage(int hp, int maxHp, int armor, int damage, int lvl,
                int mana, int maxMana, String name) {
        super(hp, maxHp, armor, damage, lvl, name);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", мана: " + mana + "/" + maxMana + ".";
    }
}