/*
Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".+
                    Units.Warrior.Villager(w), Units.Warrior.Bandit(w), Units.Shooter.Sniper(s), Units.Mage.Warlock(m), Units.Warrior.Spearman(w), Units.Shooter.Crossbowman(s), Units.Mage.Monk(m)
Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).+
Создать абстрактный класс и иерархию наследников.+
Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.+
В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.+
Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.+
*/

import Units.*;
import Units.Mage.Monk;
import Units.Mage.Warlock;
import Units.Shooter.Crossbowman;
import Units.Shooter.Sniper;
import Units.Warrior.Bandit;
import Units.Warrior.Spearman;
import Units.Warrior.Villager;

public class Game {

    public static void main(String[] args) {
	    
	    /*не хотел копипастить вывод героев, но этот код оствил если вдруг пригодится
	    Units.Warrior.Villager village = new Units.Warrior.Villager("Evah");
	    Units.Warrior.Bandit bandit = new Units.Warrior.Bandit("Damian");
	    Units.Warrior.Spearman spearman = new Units.Warrior.Spearman("Megatron");
	    Units.Shooter.Sniper sniper = new Units.Shooter.Sniper("Snakesnort");
	    Units.Shooter.Crossbowman crossbowman = new Units.Shooter.Crossbowman("Jordanne");
	    Units.Mage.Warlock warlock = new Units.Mage.Warlock("Glitterpuff");
	    Units.Mage.Monk monk = new Units.Mage.Monk("Sungaze");*/

        BaseHero[] heroes = new BaseHero[]{
                new Villager("Evah"),           //0
                new Bandit("Damian"),
                new Spearman("Megatron"),
                new Sniper("Snakesnort"),       //3
                new Crossbowman("Jordanne"),
                new Warlock("Glitterpuff"),
                new Monk("Sungaze")             //6
        };

        for (BaseHero hero : heroes) {
            System.out.println(hero);
        }
    }
}