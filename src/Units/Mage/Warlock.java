package Units.Mage;

import Units.BaseHero;
import java.util.ArrayList;

public class Warlock extends Mage {

    public Warlock(String name, ArrayList<BaseHero> team) { super(30, 60, 20, 5, 1, 5, 50, 100, name, team); }

    @Override
    public String toString() {
        return "Колдун";
    }
}