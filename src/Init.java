import Units.BaseHero;
import Units.Coordinate;
import Units.Mage.Monk;
import Units.Mage.Warlock;
import Units.Names;
import Units.Shooter.Crossbowman;
import Units.Shooter.Sniper;
import Units.Villager;
import Units.Warrior.Bandit;
import Units.Warrior.Spearman;

import java.util.ArrayList;
import java.util.Random;

public class Init {

    private static final int COUNT_CLASS = 7;

    private static final int countTeams = 2, countUnitInTeams = 10;    //установить количество команд и персонажей в команде

    public static void initTeam(ArrayList<BaseHero> team, int x) {
        for (int i = 1; i <= countUnitInTeams; i++) {
            switch (new Random().nextInt(COUNT_CLASS)) {
                case 0 -> team.add(new Monk(getName(), team, new Coordinate(x, i)));
                case 1 -> team.add(new Warlock(getName(), team, new Coordinate(x, i)));
                case 2 -> team.add(new Sniper(getName(), team, new Coordinate(x, i)));
                case 3 -> team.add(new Crossbowman(getName(), team, new Coordinate(x, i)));
                case 4 -> team.add(new Bandit(getName(), team, new Coordinate(x, i)));
                case 5 -> team.add(new Spearman(getName(), team, new Coordinate(x, i)));
                case 6 -> team.add(new Villager(getName(), team, new Coordinate(x, i)));
            }
        }
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}
