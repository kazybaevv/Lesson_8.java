package kg.geeks.game.players;

import java.util.List;

public class Berserk extends Hero {
    private int blockedDamage;
    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BLOCK_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - blockedDamage);
        System.out.println("Berserk " + this.getName()
                + " reverted \uD83D\uDD04 " + blockedDamage);
    }



    public int getBlockedDamage() {
        return blockedDamage;
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }
}
