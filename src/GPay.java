public class GPay extends AbstractWallet {

    public GPay(){

    }

    public GPay(int initialMoney,String vendor) {
        this.money = initialMoney;
        this.vendor = vendor;
    }

    @Override
    public float cashBack(int transactedMoney) {
        if (this.getMoney() >= 500)
            return (float) .2*transactedMoney;
        else
            return 0;
    }
}
