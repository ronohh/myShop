package wholeSaleShop;

import java.util.List;

/**
 * keeps our finances
 * list of buyers and suppliers
 * holds the money transactions
 * fields buyers,suppliers,amount received, amount spent, profit
 */
public class ShopAccount {
    private List<Buyer> Buyers;
    private List<Supplier> Suppliers;
    private int amountEarned;
    private int amountSpent;
    private int profit;

    //constructor initializes the fields on the main class
    public ShopAccount(List<Buyer> Buyers,List<Supplier> Suppliers){
        this.Buyers=Buyers;
        this.Suppliers=Suppliers;
        amountEarned=0;
        amountSpent=0;
        profit=0;
    }

    public List<Buyer> getBuyers() {
        return Buyers;
    }

    public List<Supplier> getSuppliers() {
        return Suppliers;
    }

    public int getAmountEarned() {
        return amountEarned;
    }

    public int getAmountSpent() {
        return amountSpent;
    }

    public int getProfit() {
        return profit;
    }

    /**
     * we are adding a class buyer a new buyer and not using parameter buyers(coz its one into class buyer)
     * @param Buyer new buyer
     */
    public void addBuyers(Buyer Buyer) {
        Buyers.add(Buyer);
    }

    /**
     * we are adding a new suppler to our shop account
     * we use parameter supplier (new supplier) and a class added to is supplier

     * don't use <list></list>
     * @param Supplier new supplier
     */
    public void setSuppliers(Supplier Supplier) {
        Suppliers.add(Supplier);
    }

    /**
     * this setter keeps our account finances we receive from sale
     * our  money we operate in our business
     * @param newAmountReceived amount we receive from sale or a suppler pays us
     */
    public void updateAmountEarned(int newAmountReceived) {
        amountEarned += newAmountReceived;
    }

    public void updateAmountSpent(int usedMoney) {
        amountSpent += usedMoney;
    }

    public void updateProfit(int profit) {
        this.profit =amountEarned-amountSpent;
    }
}
