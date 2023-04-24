/*
Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo()+;
Реализовать интерфейс в абстрактном классе и в наследниках так, чтобы getInfo возвращал информацию о персонаже.+
**Создать enum со списком имён для персонажей+
Создать два списка в классе main. В каждый список добавить по десять экземнляров наследников BaseHero.+
В main пройти по спискам и вызвать у всех персонажей getInfo.+
*/

import Units.*;
import Units.Mage.Monk;
import Units.Mage.Warlock;
import Units.Shooter.Crossbowman;
import Units.Shooter.Sniper;
import Units.Warrior.Bandit;
import Units.Warrior.Spearman;
import Units.Warrior.Villager;

import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.Random;

public class Game {

    public static void main(String[] args) {

        final int COUNT_CLASS = 7;

        ArrayList<ArrayList<BaseHero>> teams = new ArrayList<>();

        int countTeams = 5, countUnitInTeams = 10;    //установить количество команд и персонажей в команде
        for (int i = 0; i < countTeams; i++) {
            teams.add(new ArrayList<>());
            for (int j = 0; j < countUnitInTeams; j++) {
                switch (new Random().nextInt(COUNT_CLASS)) {
                    case 0 -> teams.get(i).add(new Monk(getName()));
                    case 1 -> teams.get(i).add(new Warlock(getName()));
                    case 2 -> teams.get(i).add(new Sniper(getName()));
                    case 3 -> teams.get(i).add(new Crossbowman(getName()));
                    case 4 -> teams.get(i).add(new Bandit(getName()));
                    case 5 -> teams.get(i).add(new Spearman(getName()));
                    case 6 -> teams.get(i).add(new Villager(getName()));
                }
            }
        }

        teams.forEach(team -> team.forEach(unit ->
                System.out.println(unit.getInfo() + " - команда " + (teams.indexOf(team) + 1))));

    }

    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}