package Units.Warrior;

import Units.BaseHero;
import java.util.ArrayList;

public class Bandit extends Warrior {

    public Bandit(String name, ArrayList<BaseHero> team) { super(30, 80, 15, 5, 1, 4, 5, 25, name, team); }

    @Override
    public String toString() {
        return "Бандит";
    }
}