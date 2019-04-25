import java.time.Period;

public class PayApp {

    //psvm
    //sout

    public static void main(String[] args) {

   Wallet wallet = new Wallet(200);
   User user = new User(wallet,"Mani");
   user.addMoneytoWallet(300);
   AbstractWallet abstractWallet = new GPay();

        System.out.println( "Google Pays me " + abstractWallet.cashBack());

    abstractWallet = new AmazonPay();
        System.out.println("Amazon pays me " + abstractWallet.cashBack());

     user.removeMoneyfromwallet(100);



    }
}
