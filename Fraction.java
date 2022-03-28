// Rizky Pratama
// Period 4
// 3/28/22

public class Fraction //remember to change this and the constructor 
{
   private int numerator;
   private int denominator;
   //No main method
   
   public Fraction(int numerator, int denominator){ //change this as well
      this.numerator = numerator;
      this.denominator = denominator;
   }
   
   public String toString(){
      return numerator + " / " + denominator;
   }

   public int getNumerator(){//numerator
      return numerator;
   }

   public int getDenominator(){//denominator
      return denominator;
   }

   public void addFraction(Fraction that){//adds fract
      this.numerator = this.getNumerator() * that.getDenominator() + that.getNumerator() * this.getDenominator();
      this.denominator = this.getDenominator() * that.getDenominator();
   } 

   public void multiplyFraction(Fraction that){//multiplies fract
      this.numerator = this.getNumerator()*that.getNumerator();
      this.denominator = this.getDenominator() * that.getDenominator();
   }  
}
