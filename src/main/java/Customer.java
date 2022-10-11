import java.util.ArrayList;

public class Customer extends User{
    private int RewardsPoints;

    private double Accountbalance;

    private ArrayList<String> addresses;

    private Size size;

    private Product [] products;

    public Customer(String username, String password, int rewardsPoints, double accountbalance, ArrayList<String> addresses, Size size, Product[] products) {
        super(username, password);
        RewardsPoints = rewardsPoints;
        this.Accountbalance = accountbalance;
        this.addresses = addresses;
        this.size = size;
        this.products = products;
    }

    public int getRewardsPoints() {
        return RewardsPoints;
    }

    public void setRewardsPoints(int rewardsPoints) {
        RewardsPoints = rewardsPoints;
    }

    public double getAccountbalance() {
        return Accountbalance;
    }

    public void setAccountbalance(double accountbalance) {
        if (accountbalance > 0) {
           this.Accountbalance = accountbalance;
        }
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.addresses = addresses;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void UseRewardPoints(int Rewards){
        System.out.println(getRewardsPoints() - Rewards);
    }

    public double GiverRewards(Customer customer1, double rewards){
        return customer1.getAccountbalance() + rewards;
    }

    }

