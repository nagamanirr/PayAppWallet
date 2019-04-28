public class PayApp {

    //psvm
    //sout

    public static void main(String[] args) {


    AbstractWallet abstractWallet = new GPay(2000,"Google");

        User user = new User(abstractWallet,"Mani");

        user.addMoney(300);


//
//        System.out.println( "Google Pays me " + abstractWallet.cashBack());
//
//    abstractWallet = new AmazonPay();
//        System.out.println("Amazon pays me " + abstractWallet.cashBack());

     user.removeMoneyfromwallet(100);
        System.out.println("*****************************");
        System.out.println();
        System.out.println();
        System.out.println("From here Amazon pay");


     abstractWallet = new AmazonPay(500,"Amazon");
     user = new User(abstractWallet,"Vapasi");
     user.addMoney(300);
     user.addMoney(200);
     user.removeMoneyfromwallet(100);
        System.out.println("******************************");




    }
}
