import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public class App {
    public static void PrintAllPrintable(IPrint[] prints) {
        for (int i = 0; i < prints.length; i++) {
            prints[i].Print();
        }
    }

    public static void consumeConsumables(Consume[] consumes) {
        for (int i = 0; i < consumes.length; i++) {
            consumes[i].Consuming();
        }
    }

    public static void getTotalPriceofCustomerProducts(Customer customer) {
        double sum = 0;
           sum += customer.getProducts().length;
        System.out.println(sum);
        }




    public static String getSecondaryAddressofCustomer(Customer customer) {
        String b = "";
        for (int i = 0; i < customer.getAddresses().size(); i++) {
            b = String.valueOf(customer.getAddresses().get(1));
        }
        return b;
    }

    public static void reverseandSortandPrintallProducts(ArrayList<Product> products) {
        Collections.sort(products, new CompareProducts());
        {
            for (Product i : products) {
                System.out.println(i);
            }

        }
    }

    public static void getListOfProductsGreaterThanThePriceOfProductGiven(ArrayList<Product> products, ArrayList<Double> doubleArrayList){
for (Product i: products){
   // if (doubleArrayList > doubleArrayList. )
}
    }

    public static void addASingleProductToDirectoryTiedToCustomerByNameThenPrine(Map <String, Product> ProductMap, Product product){
        for (var entry: ProductMap.entrySet()){
            ProductMap.put(product.getName(), product);
            System.out.println( entry);
            }
        }
    }



