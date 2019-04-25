public class  Wallet {

    private int money=0;

    public Wallet (int money) {
        this.money = money;

    }

    public void  addmoney(int moneyAdded)
    {

        money=money+moneyAdded;



    }


    public void  removemoney(int moneyremoved) {

        money = money - moneyremoved;



    }


    public int getMoney() {
        return money;
    }
}
