package Items;

public class Gold implements ILoot{

    private int amount;

    public Gold(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
