// Rizky Pratama
// Period 4
// 4/11/22

public class Cube extends ThreeDSolid
{
   private int length;

   public Cube(int length){
      super("cube");
      this.length = length;
   }

   public double volume(){//volume
      return length*length*length;
   }

   public String toString(){//toString
      return "cube with length: " + length;
   }
}
