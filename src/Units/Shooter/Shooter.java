package Units.Shooter;

import Units.BaseHero;
import java.util.ArrayList;

public abstract class Shooter extends BaseHero {

    protected int fireRate, accuracy;

    public Shooter(int hp, int maxHp, int armor, int damage, int lvl, int initiative,
                   int fireRate, int accuracy, String name, ArrayList<BaseHero> team) {
        super(hp, maxHp, armor, damage, lvl, initiative, name, team);
        this.fireRate = fireRate;
        this.accuracy = accuracy;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", скорострельность: " + fireRate + ", точность: " + accuracy + ".";
    }
}