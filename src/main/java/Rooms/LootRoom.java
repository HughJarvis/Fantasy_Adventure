package Rooms;

import Characters.Hero;
import Items.ILoot;

public class LootRoom extends Room {

    private ILoot loot;

    public LootRoom(String roomName, Hero hero, ILoot loot) {
        super(roomName, hero);
        this.loot = loot;
    }

    public ILoot getLoot() {
        return loot;
    }


}
