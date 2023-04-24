package Units.Warrior;

import Units.BaseHero;
import java.util.ArrayList;

public class Villager extends Warrior {

    public Villager(String name, ArrayList<BaseHero> team) {
        super(50, 100, 5, 10, 1, 3, 10, 15, name, team);
    }

    @Override
    public String toString() {
        return "Крестьянин";
    }
}