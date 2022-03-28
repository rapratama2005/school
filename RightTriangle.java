// Rizky Pratama
// Period 4
//3/28/22

public class RightTriangle //remember to change this and the constructor 
{
   int base;
   int height;
   //No main method
   
   public RightTriangle(int base, int height){ //change this as well
      this.base = base;
      this.height = height;
   }
   
   public double getArea(){//gets area
      return (double)base*height/2;
   }

   public boolean isLarger(RightTriangle other){//compares
      return (this.getArea()>other.getArea());
   }
}
