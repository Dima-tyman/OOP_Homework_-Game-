package Units.Shooter;

import Units.BaseHero;
import Units.Coordinate;
import Units.HeroParameters;
import java.util.ArrayList;
import java.util.Random;

public class Sniper extends Shooter {

    public Sniper(String name, ArrayList<BaseHero> team, Coordinate coordinate) {
        super((int) (HeroParameters.Sniper[0] * (new Random().nextInt(51) + 50) / 100), HeroParameters.Sniper[0],
                HeroParameters.Sniper[1], HeroParameters.Sniper[2], HeroParameters.Sniper[3],
                HeroParameters.Sniper[4], HeroParameters.Sniper[5], name, team, coordinate);
    }


    @Override
    public String toString() {
        return "Снайпер";
    }
}