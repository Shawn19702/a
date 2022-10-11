public class PostalStamp extends Product implements IPrint, LickAble{
    private int amount;

    public PostalStamp(String name, double price, Size size) {
        super(name, price, size);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void Print() {
        System.out.println(getName());
    }

    @Override
    public boolean SafetoLick() {
        return true;
    }
}
