package Units.Mage;

import Units.BaseHero;
import Units.Coordinate;
import Units.HeroParameters;
import java.util.ArrayList;
import java.util.Random;

public class Monk extends Mage {

    public Monk(String name, ArrayList<BaseHero> team, Coordinate coordinate) {
        super((int) (HeroParameters.Monk[0] * (new Random().nextInt(51) + 50) / 100), HeroParameters.Monk[0],
                HeroParameters.Monk[1], HeroParameters.Monk[2], HeroParameters.Monk[3],
                HeroParameters.Monk[4], HeroParameters.Monk[5], name, team, coordinate);
    }


    @Override
    public String toString() {
        return "Монах";
    }
}