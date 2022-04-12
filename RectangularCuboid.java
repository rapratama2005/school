// Rizky Pratama
// Period 4
// 4/12/22

public class RectangularCuboid extends ThreeDSolid
{
   private int length;
   private int width;
   private int height;

   public RectangularCuboid(int length, int width, int height){
      super("rectangular cuboid");
      this.length = length;
      this.width = width;
      this.height = height;
   }

   public RectangularCuboid(String name, int length){//cube
      super(name);
      this.length = length;
      this.width = length;
      this.height = length;
   }

   public double volume(){//volume
      return length*width*height;
   }

   public String toString(){//toString
      return super.toString() + " with length: " + length + " width: " + width + " height: " + height;
   }
}
