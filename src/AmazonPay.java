public class AmazonPay extends AbstractWallet{
    public AmazonPay() {
    }

    public AmazonPay(int initialMoney,String vendor){
        this.money=initialMoney;
        this.vendor = vendor;
    }

    @Override


    public float cashBack(int transactedMoney) {
        if (this.getMoney() >= 1000){
            return (float)(.2)*transactedMoney;
        }

        else
        {
            return 0;
        }
    }
}
