package Units;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class BaseHero implements GameInterface, Comparable<BaseHero> {

    protected int hp, maxHp, armor, damage, lvl;
    protected String name;
    protected ArrayList<BaseHero> team = new ArrayList<>();
    protected int initiative;
    //double position, speed;

    public BaseHero(int hp, int maxHp, int armor, int damage, int lvl, int initiative, String name, ArrayList<BaseHero> team) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.armor = armor;
        this.damage = damage;
        this.lvl = lvl;
        this.initiative = initiative;
        this.name = name;
        this.team.addAll(team);
        team.forEach(unit -> unit.team.add(this));
    }

    @Override
    public String getInfo() {
        return name + " (" + lvl + " лвл), здоровье: " + hp + "/" + maxHp + ", броня: " + armor + ", урон: " + damage;
    }

    @Override
    public void step() {}

    @Override
    public int compareTo(BaseHero o) {
        return Integer.compare(this.initiative, o.initiative);
    }

    public void damaged(int damage) {
        if (damage > 0) {
            this.hp -= damage - this.armor;
        } else {
            this.hp -= damage;
            if (this.hp > this.maxHp) {this.hp = this.maxHp;}
        }
    }

//    protected void move(double direction) {
//        //this.position += direction * this.speed;
//    }
//
//    protected void attack(Object aim) {
//        //aim.getDamage(this.damage);
//    }
//

    public ArrayList<BaseHero> getTeam() {
        return this.team;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getInitiative() {
        return initiative;
    }
}