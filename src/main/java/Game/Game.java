package Game;

import Characters.*;
import Items.Gold;
import Items.ILoot;
import Items.Spell;
import Items.Weapon;
import Rooms.Room;
import Game.EnemyGenerator;

import java.util.ArrayList;

public class Game {

   private ArrayList<Enemy> enemies;
   private ArrayList<ILoot> loot;
   private EnemyGenerator enemyGenerator;

    public Game() {
        this.enemies = new ArrayList<Enemy>();
        this.loot = new ArrayList<ILoot>();

    }

    public void createGenerator(){

    }

    public void createEnemies(EnemyGenerator enemyGenerator){
        this.enemies = enemyGenerator.generateEnemies();
    }
}
