package Units.Mage;

import Units.BaseHero;
import java.util.ArrayList;

public abstract class Mage extends BaseHero {

    protected int mana, maxMana;

    public Mage(int hp, int maxHp, int armor, int damage, int lvl, int initiative,
                int mana, int maxMana, String name, ArrayList<BaseHero> team) {
        super(hp, maxHp, armor, damage, lvl, initiative, name, team);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", мана: " + mana + "/" + maxMana + ".";
    }

    @Override
    public void step() {
        if (this.hp == 0) {
            System.out.println(this.name + " умер");
        } else {
            int minOutHpIdx = -1, idx = 0;
            double minOutHp = 1;
            for (BaseHero unit : this.team) {
                if (unit.getHp() != 0 && unit.getHp() != unit.getMaxHp() &&
                        (double) unit.getHp() / unit.getMaxHp() < minOutHp) {
                    minOutHp = (double) unit.getHp() / unit.getMaxHp();
                    minOutHpIdx = idx;
                }
                idx++;
            }
            if (minOutHpIdx != -1) this.team.get(minOutHpIdx).damaged(-this.damage);
        }
    }
}