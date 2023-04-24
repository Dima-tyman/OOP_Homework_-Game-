package Units.Shooter;

import Units.BaseHero;
import java.util.ArrayList;

public class Crossbowman extends Shooter {

    public Crossbowman(String name, ArrayList<BaseHero> team) {
        super(40, 60, 20, 5, 1, 6, 15, 60, name, team);
    }

    @Override
    public String toString() {
        return "Арбалетчик";
    }
}