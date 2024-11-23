package wholeSaleShop;

import java.util.ArrayList;
import java.util.List;

/**
 * initialize fields(constructors)
 */
public class main {
    public static void main(String[] args) {
        Buyer harry=new Buyer(1,"harry",200000);
        Buyer trump=new Buyer(2,"trump",100000);

        List<Buyer> buyerList = new ArrayList<>();
        buyerList.add(harry);
        buyerList.add(trump);

        Supplier michael=new Supplier(1,"michael",150000);
        Supplier emmanuel=new Supplier(2,"emmanuel",50000);

        List<Supplier> supplierList = new ArrayList<>();
        supplierList.add(michael);
        supplierList.add(emmanuel);

        ShopAccount mhindi= new ShopAccount(buyerList,supplierList);

        System.out.println("my accountbalance"+mhindi.getAmountEarned());
    }
}
