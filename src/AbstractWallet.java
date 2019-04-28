public abstract class AbstractWallet {

    // Made protected as it has to be accessed by child classes
    protected int money=0;
    protected String vendor;

    //Abstract class cannot contain constructor
   // public AbstractWallet (int money) {
   //     this.money = money;

   // }


    public void  addmoney(int moneyAdded)
    {

        money=money+moneyAdded;
        float cashBackAmount = cashBack(moneyAdded);
        if(cashBackAmount<=0){
            System.out.println("No Cashback from the vendor " + vendor);
        }
        else {
            System.out.println("Updating TotalBalance with Cashback amount " + cashBackAmount);
            money = money + (int) cashBackAmount;
            System.out.println("Cashback " + cashBackAmount + "is added to the wallet from vendor" + vendor );
        }
    }


    public void  removemoney(int moneyremoved) {

        money = money - moneyremoved;
        float cashBackAmount= cashBack(moneyremoved);
        if(cashBackAmount<=0){
            System.out.println("No Cashback from the vendor " + vendor);
        }
        else {
            System.out.println("Updating TotalBalance with Cashback amount " + cashBackAmount);
            money = money + (int)cashBackAmount;
            System.out.println("Cashback " + cashBackAmount + "is added to the wallet");
        }
    }

    public abstract float cashBack(int moneyTrnasacted);

    public int getMoney() {
        return money;
    }
}
