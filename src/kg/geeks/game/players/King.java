package kg.geeks.game.players;

import java.util.Random;

public class King extends Hero{
    private Random random = new Random();
    public King(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SUMMON);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes){
        if (this.getHealth() > 0){
            int chance = random.nextInt(100); // 0 .... 99
            if(chance < 10) { //10% chance
                System.out.println(this.getName() + " призвал Сайтаму \uD83D\uDC79");
                boss.setHealth(0); // one shot
                System.out.println("Сайтама ударил босса и уничтожил его одним ударом!!! \uD83D\uDC80");

            } else {
                System.out.println(this.getName() + " попытался призвать Сайтаму, но не получилось... \uD83D\uDE14");
            }

        }
    }
}
