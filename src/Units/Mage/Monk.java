package Units.Mage;

import Units.BaseHero;
import java.util.ArrayList;

public class Monk extends Mage {

    public Monk(String name, ArrayList<BaseHero> team) {
        super(20, 40, 10, 15, 1, 5, 20, 120, name, team);
    }

    @Override
    public String toString() {
        return "Монах";
    }
}