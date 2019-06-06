import Characters.Knight;
import Characters.Skeleton;
import Items.Weapon;
import Items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {

    private Knight knight;
    private Weapon weapon;
    private Skeleton skeleton;

    @Before

    public void setUp() {
        weapon = new Weapon(WeaponType.SPOON);
        knight = new Knight("Sir Danny", weapon);
        skeleton = new Skeleton("Nobody", weapon);
    }

    @Test
    public void canGetName() {
        assertEquals("Sir Danny", knight.getName());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(weapon, knight.getWeapon());
    }

    @Test
    public void cnGetHealth() {
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void startsSkint() {
        assertEquals(0, knight.getWallet());
    }

    @Test
    public void canAttack() {
        knight.attack(skeleton);
        assertEquals(24, skeleton.getHealth());
    }

    @Test
    public void canFight() {
        assertEquals("Nobody has died", knight.fight(skeleton));
        assertEquals(76, knight.getHealth());
    }
}
