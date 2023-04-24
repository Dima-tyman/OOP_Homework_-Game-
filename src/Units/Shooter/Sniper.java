package Units.Shooter;

import Units.BaseHero;
import java.util.ArrayList;

public class Sniper extends Shooter {

    public Sniper(String name, ArrayList<BaseHero> team) {
        super(30, 50, 30, 0, 1, 6, 5, 80, name, team);
    }

    @Override
    public String toString() {
        return "Снайпер";
    }
}