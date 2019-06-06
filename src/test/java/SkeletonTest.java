import Characters.Knight;
import Characters.Skeleton;
import Items.Weapon;
import Items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SkeletonTest {

    Weapon weapon;
    Skeleton skeleton;
    Knight knight;

    @Before
    public void setUp() {
        weapon = new Weapon(WeaponType.CLUB);
        skeleton = new Skeleton("Boney Brian", weapon);
        knight = new Knight("Sir Hugh", weapon);
    }

    @Test
    public void canGetWeapon() {
        assertEquals(weapon, skeleton.getWeapon());
    }

    @Test
    public void canGetHealth() {
        assertEquals(25, skeleton.getHealth());
    }

    @Test
    public void canGetName() {
        assertEquals("Boney Brian", skeleton.getName());
    }

    @Test
    public void canAttack() {
        skeleton.attack(knight);
        assertEquals(95, knight.getHealth());
    }


}
