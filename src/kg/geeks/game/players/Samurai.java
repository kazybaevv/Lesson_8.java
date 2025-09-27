package kg.geeks.game.players;

import java.util.Random;

public class Samurai extends Hero{
    private Random random = new Random();

    public Samurai(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SURIKEN);
    }



    @Override
    public void applySuperPower(Boss boss, Hero[] heroes){
        if (this.getHealth() > 0) {
            int effect = random.nextInt(2); // 0 or 1
            int power = random.nextInt(15) + 5; // power of Suriken (5-20)

            if (effect == 0){
                boss.setHealth(boss.getHealth() - power);
                System.out.println(this.getName() + "  кинул сюрикен и нанес " + power + " урона боссу!( -_•)╦̵̵̿╤─");

            }else {
                // healing the boss
                boss.setHealth(boss.getHealth() + power);
                System.out.println(this.getName() + " случайно подхилил босса на " + power + " HP \uD83D\uDE35\u200D\uD83D\uDCAB");
            }
        }
    }
}
