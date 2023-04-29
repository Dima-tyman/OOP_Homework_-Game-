package Units.Shooter;

import Units.BaseHero;
import Units.Coordinate;
import Units.Villager;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero {

    protected int ammo, accuracy;
    protected Villager villager;


    public Shooter(int hp, int maxHp, int armor, int damage, int ammo, int accuracy,
                   int initiative, String name, ArrayList<BaseHero> team, Coordinate coordinate) {
        super(hp, maxHp, armor, damage, initiative, name, team, coordinate);
        this.ammo = ammo;
        this.accuracy = accuracy;
        this.villager = null;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + ", кол-во снарядов: " + ammo + ", точность: " + accuracy + ".";
    }

    @Override
    public void step(ArrayList<BaseHero> units) {
        if (!isDeath() && this.ammo != 0) {
            double minDistance = Double.MAX_VALUE;
            int minDistanceIdx = -1, idx = 0;
            for (BaseHero unit : units) {
                if (unit != this && !this.team.contains(unit) && !unit.isDeath() &&
                        this.getCoordinate().getMinDistance(unit.getCoordinate()) < minDistance) {
                    minDistance = this.getCoordinate().getMinDistance(unit.getCoordinate());
                    minDistanceIdx = idx;
                }
                idx++;
            }

            if (minDistanceIdx != -1) {
                units.get(minDistanceIdx).damaged(this.damage);

                if (this.villager == null || this.villager.isDeath()) {
                    this.villager = null;
                    this.villager = findBusyVillager();
                    if (this.villager == null) {
                        this.ammo--;
                    } else {
                        this.villager.busy(this);
                    }
                }
            }
        }
    }


    private Villager findBusyVillager() {
        for (BaseHero unit : this.team) {
            if (!unit.isDeath() && unit.getClass() == Villager.class && !((Villager) unit).isBusy()) {
                return (Villager) unit;
            }
        }
        return null;
    }

    public void deathVillager() {
        this.villager = null;
    }
}