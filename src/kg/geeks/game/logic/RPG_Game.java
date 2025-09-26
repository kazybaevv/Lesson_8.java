package kg.geeks.game.logic;

import kg.geeks.game.players.*;

import java.util.List;
import java.util.Random;

public class RPG_Game {

    public static Random random = new Random();
    private static int roundNumber;

    public static void startGame() {
        Boss boss = new Boss(1000, 50, "Dark Lord");

        Warrior warrior1 = new Warrior(280, 15, "Saifullo");
        Warrior warrior2 = new Warrior(270, 20, "Vlad");
        Magic magic = new Magic(290, 10, "Pedri");
        Medic doc = new Medic(250, 5, "Albus", 15);
        Medic assistant = new Medic(300, 5, "Sirius", 5);
        Berserk berserk = new Berserk(260, 15, "Assassin");
        Lucky lucky = new Lucky(240,25,"Ringmaster");
        Hero[] heroes = {warrior1, doc, magic, berserk, warrior2, assistant,lucky};

        printStatistics(boss, heroes);
        while (!isGameOver(boss, heroes)) {
            playRound(boss, heroes);
        }
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("ROUND: " + roundNumber + " -------------");
        System.out.println(boss);
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }

    private static void playRound(Boss boss, Hero[] heroes) {
        roundNumber++;
        boss.chooseDefence();
        boss.attack(heroes);
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0 && boss.getHealth() > 0
                    && hero.getAbility() != boss.getDefence()) {
                hero.attack(boss);
                hero.applySuperPower(boss, heroes);
            }
        }
        printStatistics(boss, heroes);
    }

    private static boolean isGameOver(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;
    }
}
