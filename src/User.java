public class User {

  //User should have a wallet
  AbstractWallet abstractWallet;
  String name;

    public User() {
    }

    public User(AbstractWallet abstractWallet,String name) {
        this.abstractWallet=abstractWallet;
        this.name = name;
    }

    public void addMoney(int amount) {

        abstractWallet.addmoney(amount);

        System.out.println(amount +  " added in to the  wallet of "+ name) ;
        System.out.println( "Total Money in wallet is " + abstractWallet.getMoney()+"  RS");
    }


    public void removeMoneyfromwallet(int amount) {

        abstractWallet.removemoney(amount);
        System.out.println(amount + " RS"+ "  removed from the  wallet of " + name);
        System.out.println( "Total Money in wallet is " + abstractWallet.getMoney());


    }

}