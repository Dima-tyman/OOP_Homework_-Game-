/*
**Перенести класс крестьянин в отдельный класс (не воин)++
**Пересмотреть поля классов++
**Добавить рандомайзер на характеристики героев+-
Создать класс хранящий координаты x и y. С конструктором и методом принимающим координату а возвращающим расстояние от своей координаты до переданной.++
Переопределить метод step в стрелках таким образом, чтобы при наличии стрел и жизней стрелки находили ближайшего противника и наносили ему повреждение.++
В своей комманде найти крестьян и, если крестьянин жив и не занят, занять его доставкой стрел. Иначе стрелы уходят по одной на выстрел.++
!!!Маг мог вылечить мертвого героя++
*/

import Units.*;
import Units.Mage.Monk;
import Units.Mage.Warlock;
import Units.Shooter.Crossbowman;
import Units.Shooter.Sniper;
import Units.Warrior.Bandit;
import Units.Warrior.Spearman;
import Units.Villager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;

public class Game {

    public static void main(String[] args) {

        final int COUNT_CLASS = 7;

        ArrayList<ArrayList<BaseHero>> teams = new ArrayList<>();

        int countTeams = 2, countUnitInTeams = 5;    //установить количество команд и персонажей в команде
        for (int i = 0; i < countTeams; i++) {
            teams.add(new ArrayList<>());
            for (int j = 0; j < countUnitInTeams; j++) {
                switch (new Random().nextInt(COUNT_CLASS)) {
                    case 0 -> teams.get(i).add(new Monk(getName(), teams.get(i), new Coordinate(i * 10)));
                    case 1 -> teams.get(i).add(new Warlock(getName(), teams.get(i), new Coordinate(i * 10)));
                    case 2 -> teams.get(i).add(new Sniper(getName(), teams.get(i), new Coordinate(i * 10)));
                    case 3 -> teams.get(i).add(new Crossbowman(getName(), teams.get(i), new Coordinate(i * 10)));
                    case 4 -> teams.get(i).add(new Bandit(getName(), teams.get(i), new Coordinate(i * 10)));
                    case 5 -> teams.get(i).add(new Spearman(getName(), teams.get(i), new Coordinate(i * 10)));
                    case 6 -> teams.get(i).add(new Villager(getName(), teams.get(i), new Coordinate(i * 10)));
                }
            }
        }

        teams.forEach(team -> team.forEach(unit ->
                System.out.println(unit.getInfo() + " - команда " + (teams.indexOf(team) + 1) + " " + unit)));

        ArrayList<BaseHero> initiative = new ArrayList<>();
        teams.forEach(initiative::addAll);

        System.out.println("------------");

        for (int i = 0; i < 10; i++) {
            initiative.forEach(unit -> unit.step(initiative));
        }

        teams.forEach(team -> team.forEach(unit ->
                System.out.println(unit.getInfo() + " - команда " + (teams.indexOf(team) + 1) + " " + unit)));

        System.out.println(initiative);
    }

    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}