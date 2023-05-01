package Units;

import Units.Shooter.Crossbowman;
import Units.Shooter.Shooter;
import Units.Shooter.Sniper;

import java.util.ArrayList;
import java.util.Random;

public class Villager extends BaseHero {

    protected Shooter shooter;


    public Villager(String name, ArrayList<BaseHero> team, Coordinate coordinate) {
        super((int) (HeroParameters.Villager[0] * (new Random().nextInt(51) + 50) / 100), HeroParameters.Villager[0],
                HeroParameters.Villager[1], HeroParameters.Villager[2], HeroParameters.Villager[3], name, team,
                coordinate);
        this.shooter = null;
    }


    @Override
    public String toString() {
        return "Житель";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ".";
    }

    @Override
    public void step(ArrayList<BaseHero> units) {
        if (isDeath()) {
            if (this.shooter != null) {
                this.shooter.setVillager(null);
                this.shooter = null;
            }
        } else {
            if (this.shooter != null) {
                if (this.shooter.isDeath()) {
                    this.shooter.setVillager(null);
                    this.shooter = null;
                    this.shooter = findBusyShooter();
                }
            } else {
                this.shooter = findBusyShooter();
            }

            if (this.shooter != null) {
                this.shooter.setVillager(this);
                this.shooter.putAmmo();
            }
        }
    }


    private Shooter findBusyShooter() {
        for (BaseHero unit : this.team) {
            if (!unit.isDeath() && (unit.getClass() == Sniper.class || unit.getClass() == Crossbowman.class) &&
                    ((Shooter) unit).getVillager() == null) {
                return (Shooter) unit;
            }
        }
        return null;
    }
}