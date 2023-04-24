/*
Добавить в интерфейс(если ещё нету) метод step() и реализовать его в абстрактном классе и у магов по примеру семинара.+
Добавить поле инициатива(если ещё нету). Обьеденить списки и отсортировать по инициативе, по примеру семинара.+
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
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Game {

    public static void main(String[] args) {

        final int COUNT_CLASS = 7;

        ArrayList<ArrayList<BaseHero>> teams = new ArrayList<>();

        int countTeams = 2, countUnitInTeams = 5;    //установить количество команд и персонажей в команде
        for (int i = 0; i < countTeams; i++) {
            teams.add(new ArrayList<>());
            for (int j = 0; j < countUnitInTeams; j++) {
                switch (new Random().nextInt(COUNT_CLASS)) {
                    case 0 -> teams.get(i).add(new Monk(getName(), teams.get(i)));
                    case 1 -> teams.get(i).add(new Warlock(getName(), teams.get(i)));
                    case 2 -> teams.get(i).add(new Sniper(getName(), teams.get(i)));
                    case 3 -> teams.get(i).add(new Crossbowman(getName(), teams.get(i)));
                    case 4 -> teams.get(i).add(new Bandit(getName(), teams.get(i)));
                    case 5 -> teams.get(i).add(new Spearman(getName(), teams.get(i)));
                    case 6 -> teams.get(i).add(new Villager(getName(), teams.get(i)));
                }
            }
        }

        teams.forEach(team -> team.forEach(unit ->
                System.out.println(unit.getInfo() + " - команда " + (teams.indexOf(team) + 1))));

        ArrayList<BaseHero> initiative = new ArrayList<>();
        teams.forEach(initiative::addAll);

        System.out.println("------------");
        System.out.println(initiative);
        Collections.sort(initiative);
        System.out.println(initiative);
        System.out.println("------------");

        initiative.forEach(BaseHero::step);

        teams.forEach(team -> team.forEach(unit ->
                System.out.println(unit.getInfo() + " - команда " + (teams.indexOf(team) + 1))));
    }

    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}