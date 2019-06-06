import Characters.*;
import Items.Gold;
import Items.WeaponType;
import Rooms.Room;
import org.junit.Before;

public class RoomTest {

    Room room;
    Skeleton skeleton;
    Orc orc;
    BlackKnight blackKnight;
    Troll troll;
    Necromancer necromancer;
    Knight knight;
    Gold gold;


    @Before
    public void setUp(){
        skeleton = new Skeleton(WeaponType.CLUB)
        room = new Room("Certain Doom");
    }
}
