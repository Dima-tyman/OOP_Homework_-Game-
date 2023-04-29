package Units.Shooter;

import Units.BaseHero;
import Units.Coordinate;
import Units.HeroParameters;
import java.util.ArrayList;
import java.util.Random;

public class Crossbowman extends Shooter {

    public Crossbowman(String name, ArrayList<BaseHero> team, Coordinate coordinate) {
        super((int) (HeroParameters.Crossbowman[0] * (new Random().nextInt(51) + 50) / 100), HeroParameters.Crossbowman[0],
                HeroParameters.Crossbowman[1], HeroParameters.Crossbowman[2], HeroParameters.Crossbowman[3],
                HeroParameters.Crossbowman[4], HeroParameters.Crossbowman[5], name, team, coordinate);
    }

    @Override
    public String toString() {
        return "Арбалетчик";
    }
}