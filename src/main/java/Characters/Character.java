package Characters;

import Items.Weapon;

public abstract class Character {

    private String name;
    private Weapon weapon;
    private int health;

    public Character(String name, Weapon weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }


    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int amount) {
        this.health -= amount;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
