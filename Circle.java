// Rizky Pratama
// Period 4
// 4/1/22

public class Circle //remember to change this and the constructor 
{
   private Point point;
   private double radius;
   //No main method
   
   public Circle(Point point, double radius){ //change this as well
      this.point = point;
      this.radius = radius;
   }
   
   public double area(){//returns area
      return Math.PI * Math.pow(radius, 2);
   }

   public double circumfrence(){//returns circumfrence
      return 2 * Math.PI * radius;
   }

   public boolean contains(Point other){//checks if point's distance from center is smaller than radius
      return (point.distanceTo(other)<=radius);
   }
}
