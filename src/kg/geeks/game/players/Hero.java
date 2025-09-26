package kg.geeks.game.players;

import java.util.List;

public  class Hero extends GameEntity {
    private SuperAbility ability;

    public Hero(int health, int damage, String name, SuperAbility ability) {
        super(health, damage, name);
        this.ability = ability;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void attack(Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
    }
@Override
public String toString(){
        return getClass().getSimpleName() + " " + getName() + " | Health: " + getHealth() + " | Damage: " + getDamage();
}

    public void applySuperPower(Boss boss, Hero[] heroes) {

    }


}
