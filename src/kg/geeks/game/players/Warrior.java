package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

import java.util.List;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int crit = RPG_Game.random.nextInt(2, 6) * this.getDamage();
        boss.setHealth(boss.getHealth() - crit);
        System.out.println("Warrior " + this.getName()
                + " hits critically \uD83D\uDCA5" + crit);
    }


}
