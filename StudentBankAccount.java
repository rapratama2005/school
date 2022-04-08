// Rizky Pratama
// Period 4
// 4/8/22

public class StudentBankAccount extends BankAccount //remember to change this and the constructor 
{

   public StudentBankAccount (String accountName, int balance){
      super(accountName, balance);
   }

   public void deposit(int amount){//deposit and with draw w/ bonus fee
      super.deposit(amount+1);
   }

   public void withdraw(int amount){
      super.withdraw(amount+2);
   }
}
