public class IceCream extends Product implements Consume, LickAble{
    public IceCream(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void Consuming() {
        System.out.println("Consuming Ice Cream");
    }

    @Override
    public boolean SafetoLick() {
        return true;
    }


    }

