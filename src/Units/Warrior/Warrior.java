package Units.Warrior;

import Units.BaseHero;
import java.util.ArrayList;

public abstract class Warrior extends BaseHero {

    protected int resistance, ultimateDamage;

    public Warrior(int hp, int maxHp, int armor, int damage, int lvl, int initiative,
                   int resistance, int ultimateDamage, String name, ArrayList<BaseHero> team) {
        super(hp, maxHp, armor, damage, lvl, initiative, name, team);
        this.resistance = resistance;
        this.ultimateDamage = ultimateDamage;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", сопротивление: " + resistance + ", ульта: " + ultimateDamage + ".";
    }
}