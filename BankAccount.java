// Rizky Pratama
// Period 4
// 4/8/22

public class BankAccount //remember to change this and the constructor 
{
   private String accountName;
   private int balance;
   //No main method
   
   public BankAccount(String accountName, int balance){
      this.accountName = accountName;
      this.balance = balance;
   }

   public int getBal(){
      return balance;
   }
   public String toString(){
      return accountName + "'s balance is $" + balance;
   }

   public void deposit(int amount){//deposit and withdraw
      balance += amount;
   }

   public void withdraw(int amount){
      balance -= amount;
   }
}
