/*
Реализовать визуализацию своего проекта по примеру семинара с использованием приложенный классов.++
Доработать степ крестьян.
*/

import Units.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Game {

    public static ArrayList<BaseHero> holyTeam = new ArrayList<>();
    public static ArrayList<BaseHero> darkTeam = new ArrayList<>();
    public static ArrayList<BaseHero> allTeam = new ArrayList<>();

    public static void main(String[] args) {

        Init.initTeam(holyTeam, 1);
        Init.initTeam(darkTeam, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        Collections.sort(allTeam);

        Scanner input = new Scanner(System.in);

        System.out.println(allTeam);

        while (true) {
            View.view();
            if (Objects.equals(input.nextLine(), "q")) {
                break;
            }
            allTeam.forEach(unit -> unit.step(allTeam));
        }
    }
}