package Rooms;

import Characters.Enemy;
import Characters.Hero;
import Items.ILoot;

import java.util.ArrayList;

public abstract class Room {

    private String roomName;
    private Hero hero;


    public Room(String roomName, Hero hero) {
        this.roomName = roomName;
        this.hero = hero;
    }

    public String getRoomName() {
        return roomName;
    }

    public Hero getHero() {
        return hero;
    }
}
