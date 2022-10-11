public class Battery extends Product implements Consume{
    public Battery(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void Consuming() {
        System.out.println("Battery consuming");
    }
}
