package Units.Mage;

import Units.BaseHero;
import Units.Coordinate;
import Units.HeroParameters;
import java.util.ArrayList;
import java.util.Random;

public class Warlock extends Mage {

    public Warlock(String name, ArrayList<BaseHero> team, Coordinate coordinate) {
        super((int) (HeroParameters.Warlock[0] * (new Random().nextInt(51) + 50) / 100), HeroParameters.Warlock[0],
                HeroParameters.Warlock[1], HeroParameters.Warlock[2], HeroParameters.Warlock[3],
                HeroParameters.Warlock[4], HeroParameters.Warlock[5], name, team, coordinate);
    }

    @Override
    public String toString() {
        return "Колдун";
    }
}