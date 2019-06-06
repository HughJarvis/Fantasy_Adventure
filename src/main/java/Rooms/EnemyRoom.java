package Rooms;

import Characters.Enemy;
import Characters.Hero;

public class EnemyRoom extends Room {

    private Enemy enemy;

    public EnemyRoom(String roomName, Hero hero, Enemy enemy) {
        super(roomName, hero);
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
