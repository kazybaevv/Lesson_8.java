package kg.geeks.game.players;

import java.util.Random;

public  class Lucky extends Hero {
    private Random random = new Random();



    public Lucky(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.LUCKY_SHOT);
    }



    @Override
    public void applySuperPower(Boss boss, Hero [] heroes){
       int dice1 = random.nextInt(6) + 1;
       int dice2 = random.nextInt(6) + 1;

        System.out.println(getName() + " Бросил кости: " + dice1 + " и " + dice2);

        if (dice1 == dice2) {
            boss.setHealth(boss.getHealth() - dice1);
            System.out.println("Кости совпали!\uD83C\uDFB2 Босс теряет " + dice1 + " HP");
        }else {
           Hero randomHero = heroes[random.nextInt(heroes.length)];
           while (randomHero == this || randomHero.getHealth() <=0){
               randomHero = heroes[random.nextInt(heroes.length)];
            }
           int damage = dice1 + dice2;
           randomHero.setHealth(randomHero.getHealth() - damage);
            System.out.println("Кости не совпали!\uD83C\uDFB2 " + randomHero.getName() + " теряет " + damage + " HP");
        }
    }


}

