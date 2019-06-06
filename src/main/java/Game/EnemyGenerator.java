package Game;

import Characters.*;
import Items.Weapon;
import Items.WeaponType;

import java.util.ArrayList;


public class EnemyGenerator {

    private ArrayList<Enemy> enemies;

    public EnemyGenerator() {
        this.enemies = new ArrayList<Enemy>();
    }

    public ArrayList<Enemy> generateEnemies(){
        Weapon spoon = new Weapon(WeaponType.SPOON);
        Weapon sword = new Weapon(WeaponType.SWORD);
        Weapon axe = new Weapon(WeaponType.BATTLEAXE);
        Weapon bow = new Weapon(WeaponType.BOWANDARROW);
        Weapon knife = new Weapon(WeaponType.KNIFE);
        Weapon greatSword = new Weapon(WeaponType.GREATSWORD);
        Weapon club = new Weapon(WeaponType.CLUB);
        Necromancer necromancer = new Necromancer(spoon);
        Skeleton skeleton = new Skeleton(club);
        Orc orc = new Orc(sword);
        BlackKnight blackKnight = new BlackKnight(greatSword);
        Troll troll = new Troll(bow);


        enemies.add(necromancer);
        enemies.add(troll);
        enemies.add(orc);
        enemies.add(blackKnight);
        enemies.add(skeleton);
        return enemies;
    }
}
