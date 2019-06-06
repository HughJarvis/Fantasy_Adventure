package Characters;

import Items.Weapon;

public abstract class Enemy extends Character {

    public Enemy(String name, Weapon weapon, int health) {
        super(name, weapon, health);
    }

    public void attack(Hero hero){
        hero.reduceHealth(this.getWeapon().getDamage());
    }

    public Boolean healthCheck(){
        return (this.getHealth() > 0);
    }
}
