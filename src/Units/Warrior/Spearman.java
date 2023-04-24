package Units.Warrior;

import Units.BaseHero;
import java.util.ArrayList;

public class Spearman extends Warrior {

    public Spearman(String name, ArrayList<BaseHero> team) {
        super(60, 120, 10, 15, 1, 4, 20, 30, name, team);
    }

    @Override
    public String toString() {
        return "Копейщик";
    }
}