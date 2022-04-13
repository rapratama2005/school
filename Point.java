// Rizky Pratama
// Period 4
// 4/13/22

public class Point //remember to change this and the constructor 
{
   private int x;
   private int y;
   //No main method
   
   public Point(){ //change this as well
      this.x = (int) ((Math.random()*2)+1);
      this.y = (int) ((Math.random()*2)+1);
   }

   public int getX(){//gets x
      return x;
   }

   public int getY(){//gets y
      return y;
   }

   public String toString(){//toString
      return "("+x+","+y+")";
   }

   public boolean equals(Point that){//compares
      if(this.getX()==that.getX() && this.getY()==that.getY()){
         return true;
      } else {
         return false;
      }
   }
}
