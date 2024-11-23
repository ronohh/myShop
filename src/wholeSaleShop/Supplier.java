package wholeSaleShop;

/**
 * this class will handle the supplier details and amount good supplied and keep tracks of payment
 *  transaction is deposit and second installment only
 *  field are id,name,amount paid,amount total
 */
public class Supplier {
    private int id;
    private String name;
    private int amountPaid;
    private int amountOwed;
    private int amountTotal;

    public Supplier(int id,String name,int amountTotal){
        amountPaid=0;
        amountOwed=0;
       this.amountTotal=amountTotal;
        this.id=id;
        this.name=name;
    }
    public  int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public int getAmountOwed() {
        return amountOwed;
    }

    public int getAmountTotal() {
        return amountTotal;
    }
    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateAmountPaid(int deposit, int installment1) {

        amountPaid = deposit + installment1;
    }

    /**
     * fixed that the set function is amount owed but the amount total after being subtracted
     * the remaining value is the amount owed
     * @param amountOwed money we are still required to pay
     */
    public void setAmountOwed(int amountOwed) {
         amountTotal -= amountPaid;
    }

    public void setAmountTotal(int deposit, int remainingAmount) {
        amountTotal= deposit + remainingAmount;
    }
}
