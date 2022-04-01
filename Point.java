// Rizky Pratama
// Period 4
// 4/1/22

public class Point //remember to change this and the constructor 
{
   private double x;
   private double y;
   //No main method
   
   public Point(double x, double y){ //change this as well
      this.x = x;
      this.y = y;
   }

   public double getX(){
      return x;
   }

   public double getY(){
      return y;
   }

   public double distanceTo(Point that){//distance formulat
      return Math.sqrt(Math.pow(that.getX() - this.x, 2) + Math.pow(that.getY() - this.y, 2));
   }
}
