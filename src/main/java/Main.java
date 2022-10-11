import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Califronia");

        arrayList.add("Delawere");


        IceCream iceCream = new IceCream("Bob", 20, Size.S);

        Battery battery = new Battery("John", 20, Size.L);

        Product product [] = {iceCream , battery};

        Admin admin = new Admin("Shawn", "39029" );

        Customer customer = new Customer("Ryan", "25256", 252, -150.0, arrayList, Size.S, product );

        Customer customer1 = new Customer("SHawn", "25256", 252, 200.0, arrayList, Size.S, product );

        Customer customer3 = new Customer("Saad", "25256", 252, 200.0, arrayList, Size.S, product );

    //    customer.setAccountbalance(-3);

        System.out.println(customer.getAccountbalance());

        System.out.println(customer.GiverRewards(customer1, 1000.0));

       customer.UseRewardPoints(100);

      //
        // customer1.p


        System.out.println(App.getSecondaryAddressofCustomer(customer));

        Map<String, Product> productMap = new HashMap<>();

        productMap.put(customer.getUsername(), iceCream);

App.addASingleProductToDirectoryTiedToCustomerByNameThenPrine(productMap, iceCream);

}
}
