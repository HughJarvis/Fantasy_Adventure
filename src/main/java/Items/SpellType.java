package Items;

public enum SpellType {

    LIGHTING (10, 10),
    FIREBALL (15, 12),
    TICKLE (1, 1);

    private final int damage;
    private final int price;

    SpellType(int damage, int price) {
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
