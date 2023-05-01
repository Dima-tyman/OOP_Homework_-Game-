package Units.Warrior;

import Units.BaseHero;
import Units.Coordinate;

import java.util.ArrayList;

public abstract class Warrior extends BaseHero {

    protected int resistance, ultimateDamage;


    public Warrior(int hp, int maxHp, int armor, int damage, int resistance, int ultimateDamage,
                   int initiative, String name, ArrayList<BaseHero> team, Coordinate coordinate) {
        super(hp, maxHp, armor, damage, initiative, name, team, coordinate);
        this.resistance = resistance;
        this.ultimateDamage = ultimateDamage;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + ", RES " + resistance + ", ULT " + ultimateDamage;
    }
}