package Items;

public enum WeaponType {

    SWORD(10, 10),
    CLUB(5, 2),
    KNIFE(5, 5),
    BATTLEAXE(15, 10),
    BOWANDARROW(10, 5),
    GREATSWORD(20, 15),
    SPOON(1, 5);

    private final int damage;
    private final int price;

    WeaponType(int damage, int price) {
        this.damage = damage;
        this.price = price;
    }

    public int getDamage() {
        return damage;
    }

    public int getPrice() {
        return price;
    }
}
