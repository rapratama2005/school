// Rizky Pratama
// Period 4
// 4/6/22

public class Square extends Rectangle //remember to change this and the constructor 
{
   //No main method
   
   public Square(int length){ //change this as well
      super(length, length);
   }

   public String toString(){//toString
      return "square with " + super.toString() + "\narea: " + area();
   }

   public int area(){
      return super.getWidth()*super.getWidth();
   }
}
