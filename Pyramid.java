// Rizky Pratama
// Period 4
// 4/12/22

public class Pyramid extends ThreeDSolid
{
   private int length;
   private int width;
   private int height;
   public Pyramid(int length, int width, int height){
      super("pyramid");
      this.length = length;
      this.width = width;
      this.height = height;
   }

   public double volume(){//volume
      return (length*width*height)/3.0;
   }

   public String toString(){//toString
      return super.toString() + " length: " + length + " width: " + width + " height: " + height;
   }
}
