// Rizky Pratama
// Period 4
// 3/31/22

public class VenmoAccount //remember to change this and the constructor 
{
   private String ID;
   private int bal;
   //No main method
   
   public VenmoAccount(String ID, int bal){ //change this as well
      this.ID = ID;
      this.bal = bal;
   }
   
   public String toString(){//toString
      return ID + " $" + bal;
   }

   public void transfer(VenmoAccount other, int amount){//transfer
      this.bal-=amount;
      other.bal+=amount;
   }
}
