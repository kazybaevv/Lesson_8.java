package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

import java.util.List;

public class Magic extends Hero {
    private int buffDamage;
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);

    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
     if(RPG_Game.roundNumber <= 4){
         for (Hero hero : heroes){
             if (hero.getHealth() > 0 && hero != this){
                 int boost = 5;
                 hero.setDamage(hero.getDamage() + boost);
                 System.out.println(this.getName() + " усилил " + hero.getName() + " на +" + boost + " атаки \uD83D\uDCC8");
             }
         }
     }
        }
    }



