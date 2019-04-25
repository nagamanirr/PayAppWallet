public abstract class AbstractWallet {


    private int money=0;

    //Abstract class cannot contain constructor
   // public Wallet (int money) {
   //     this.money = money;

   // }

    public void  addmoney(int moneyAdded)
    {

        money=money+moneyAdded;
    }


    public void  removemoney(int moneyremoved) {

        money = money - moneyremoved;
    }

    public abstract int cashBack();

    public int getMoney() {
        return money;
    }
}
