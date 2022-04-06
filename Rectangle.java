// Rizky Pratama
// Period 4
// 4/6/22

public class Rectangle //remember to change this and the constructor 
{
   private int width;
   private int height;
   //No main method
   
   public Rectangle(int width, int height){ //change this as well
      this.width = width;
      this.height = height;
   }

   public String toString(){//toString
      return "width: " + width + " height: " + height;
   }

   public int getWidth(){return width;}
}
