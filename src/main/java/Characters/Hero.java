package Characters;

import Items.Spell;
import Items.Weapon;

import java.util.ArrayList;

public abstract class Hero extends Character {
    private int wallet;
    private ArrayList<Weapon> weapons;
    private ArrayList<Spell> spells;

    public Hero(String name, Weapon weapon) {
        super(name, weapon, 100);
        this.wallet = 0;
    }

    public int getWallet() {
        return wallet;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void collectSpell(Spell spell) {
        this.spells.add(spell);
    }

    public void collectWeapon(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public void addToWallet(int amount) {
        this.wallet += amount;
    }

    public void takeFromWallet(int amount) {
        this.wallet -= amount;
    }

    public void attack(Enemy enemy) {
        enemy.reduceHealth(this.getWeapon().getDamage());
    }

    public Boolean healthCheck() {
        return (this.getHealth() > 0);
    }

    public String fight(Enemy enemy) {
        this.attack(enemy);
        if (!enemy.healthCheck()) {
            return enemy.getName() + " has died";
        }
        enemy.attack(this);
        if (!this.healthCheck()) {
            return this.getName() + " has died";
        }
        return this.fight(enemy);
    }
}



