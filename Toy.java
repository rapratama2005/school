// Rizky Pratama
// Period 4
// 4/14/22

public class Toy //remember to change this and the constructor 
{
   private String type;
   private int model;
   private int price;
   //No main method
   
   public Toy(){ //change this as well // 0 parameter constructor
      String[] abc = {"A","B","C"};
      type = abc[(int)(Math.random()*3)];
      model = (int)(Math.random()*3)+1;
      price = (int)(Math.random()*5)+1;
   }
   
   public String getType(){//getters
      return type;
   }
   public int getModel(){
      return model;
   }
   public int getPrice(){
      return price;
   }
   public String toString(){//overides
      return type+model+" $"+price;
   }
   public boolean equals(Toy that){
      return this.toString().equals(that.toString());
   }
}
