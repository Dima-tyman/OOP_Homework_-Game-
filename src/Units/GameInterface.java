package Units;

import java.util.ArrayList;

public interface GameInterface {

    void step(ArrayList<BaseHero> units);

    String getInfo();
}