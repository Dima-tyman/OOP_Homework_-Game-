package Units;

import Units.Shooter.Shooter;

import java.util.ArrayList;
import java.util.Random;

public class Villager extends BaseHero {

    protected boolean busy;
    protected Shooter shooter;


    public Villager(String name, ArrayList<BaseHero> team, Coordinate coordinate) {
        super((int) (HeroParameters.Villager[0] * (new Random().nextInt(51) + 50) / 100), HeroParameters.Villager[0],
                HeroParameters.Villager[1], HeroParameters.Villager[2], HeroParameters.Villager[3], name, team,
                coordinate);
        this.busy = false;
        this.shooter = null;
    }


    @Override
    public String toString() {
        return "Крестьянин";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ".";
    }

    @Override
    public void step(ArrayList<BaseHero> units) {
        if (isDeath()) {
            this.shooter = null;
        }
        if (this.shooter != null && this.shooter.isDeath()) {
            this.shooter.deathVillager(); //возможно это не обязательно
            this.busy(null);
        }
    }


    public boolean isBusy() {
        return this.busy;
    }

    public void busy(Shooter shooter) {
        this.busy = !this.busy;
        this.shooter = shooter;
    }
}