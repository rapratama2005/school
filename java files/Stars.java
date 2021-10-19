// Rizky Pratama
// Period 4
// 8/26/21

// Creates stars
public class Stars
{
   public static void println(String line){ //Condenses System.out.println into println("text")
      System.out.println(line);
   }
   
   public static void twoFiveArray(){ // sets up the 2x5 array 
      println("*****\n*****");
   }
   
   public static void xStar(){ // sets up the "x" star
      println(" * *\n  *\n * *");
   }
   
   
    public static void main(String[] args) //main
    {
      twoFiveArray();
      xStar();
      println(" ");
      twoFiveArray();
      xStar();
      twoFiveArray();
      println(" ");
      println("  *");
      println("  *");
      println("  *");
      twoFiveArray();
      xStar();

    }
}
