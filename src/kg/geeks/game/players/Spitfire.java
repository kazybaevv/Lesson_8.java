package kg.geeks.game.players;

public class Spitfire extends Hero{
    public Spitfire(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.EXTRA_DAMAGE);
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes){
        if (this.getHealth() > 0) {
            boolean heroKilled = false;

            for (Hero hero : heroes){
                if(hero != this && hero.getHealth() <= 0){
                    heroKilled = true;
                    break;
                }
            }
            if (heroKilled){
                int extraDamage = 80;
                boss.setHealth(boss.getHealth() - extraDamage);
                System.out.println(this.getName() + " впал в ярость и нанес +" + extraDamage + " дополнительного урона боссу! \uD83E\uDDE8");
            }
        }
    }
}
