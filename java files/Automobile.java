// Rizky Pratama
// Period 4
// 10/18/21


import java.util.Scanner; //imports scanner

public class Automobile //remember to change this
{
   public static void print(String line){ // condenses System.out.print into print(line)
      System.out.print(line);
   }
   
   public static void repeatChar(String c, int times){//repeat Characters
      for (int i = 1; i <= times; i++){
         print(c);
      }
   }
   
   public static void backWindow(){//Does the backwindow
      print("| ");
      repeatChar("#",3);
      print(" ||  ");
   }
   
   public static void topWheel(){//top part of the wheel
      print("/ /..\\ \\");
   }
   
   public static void bottomWheel(){//bottom part of the wheel
      print("  \\__/  ");
   }
   
   public static void space(int times){//repeatCharacters() but spaces only
      repeatChar(" ",times);
   }
   public static void auto(int l){
      //Row 1
      print(".");
      repeatChar("-", l + 11);
      print(".\n");
      backWindow();
      repeatChar("#",l + 3);
      print("\\\n");
      //Row 2
      backWindow();
      repeatChar("#",l + 4);
      print("\\.\n");
      //Row 3
      print("D");
      space(5);
      print("||");
      space(l+2);
      print("<>");
      space(4);
      print("|");
      repeatChar("-",6);
      print("+\n");
      //Row 4
      print("|  ");
      repeatChar("_",6);
      space(l+6);
      print("/");
      repeatChar("_",6);
      print(" |\n");
      //Row 5
      print(" \\");
      topWheel();
      repeatChar("_",l+5);
      topWheel();
      print("|\n");
      //Row 6
      space(2);
      bottomWheel();
      space(l+5);
      bottomWheel();
   }
   
    public static void main(String[] args) //main function
    {
      Scanner input = new Scanner(System.in);//imports scanner
      //asks for and records length
      print("Enter length: ");
      int l = input.nextInt();
      //output
      auto(l);
         

    }
}
