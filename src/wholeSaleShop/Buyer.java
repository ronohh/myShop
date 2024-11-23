package wholeSaleShop;

/**
 * create a buyer class that tracks what the customer bought and the payment they have paid
 * it holds the following fields
 * id,name,totalInstallments,amount required
 *
 * how to initialize amount required for every purchase?
 */
public class Buyer {
    private int id;
    private String name;
    private int totalInstallments;
    private int goodsTotalPrice;

    //constructor that initializes the fields
    public Buyer(int id,String name, int goodsTotalPrice){
        totalInstallments=0;
        this.goodsTotalPrice=goodsTotalPrice;
        this.id=id;
        this.name=name;
    }
    //getter methods
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public int getTotalInstallments() {
        return totalInstallments;
    }

    public int getGoodsTotalPrice() {
        return goodsTotalPrice;
    }
    //setter methods

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void updateTotalInstallments(int totalInstallmentsPaid){
        totalInstallments +=totalInstallmentsPaid;
    }

    public void setGoodsTotal(int goodsTotalPrice) {
        this.goodsTotalPrice=goodsTotalPrice;
    }
}
