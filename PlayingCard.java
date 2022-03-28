// Rizky Pratama
// Period 4
// 3/24/22

public class PlayingCard //remember to change this and the constructor 
{
   private String rank;
   private String suit;
   private int value;
   //No main method
   
   public PlayingCard(String initRank, String initSuit, int initValue){ //change this as well
      rank = initRank;
      suit = initSuit;
      value = initValue;
   }
   
   public String toString(){//toString method
      return rank + " of " + suit;
   }
   
   public int getValue(){//gets value
      return value;
   }
}
