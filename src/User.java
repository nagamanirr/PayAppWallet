public class User {

  //User should have a wallet
  Wallet wallet;
  String name;

    public User() {
    }

    public User(Wallet wallet,String name) {
        this.wallet = wallet;
        this.name = name;
    }

    public void addMoneytoWallet(int amount) {

        wallet.addmoney(amount);

        System.out.println(amount +  " added in to the  wallet of "+ name) ;
        System.out.println( "Total Money in wallet is " + wallet.getMoney()+"  RS");
    }


    public void removeMoneyfromwallet(int amount) {

        wallet.removemoney(amount);
        System.out.println(amount + " RS"+ "  removed from the  wallet of " + name);
        System.out.println( "Total Money in wallet is " + wallet.getMoney());


    }

}