package Items;

public class Weapon implements ILoot{

    private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }


    public int getDamage() {
        return this.weaponType.getDamage();
    }

    public int getPrice(){
        return this.weaponType.getPrice();
    }
}
