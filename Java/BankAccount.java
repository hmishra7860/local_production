class BankAccount{
   private double balance;

   public BankAccount(double balance){
    this.balance = balance;
   }
   public double getBalance(){
    return balance;
   }

   public void deposit(double amount){
    if(amount > 0){
        balance += amount;
        System.out.println("Deposited: " +amount+ "total balance: " +balance);
    }

   }

   
   public static void main(String[] args){
        BankAccount ba = new BankAccount(0000);
        ba.deposit(30000);
        ba.deposit(20000);
        ba.deposit(50000);
        ba.getBalance();

    }
}
