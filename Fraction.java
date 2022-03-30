// Rizky Pratama
// Period 4
// 3/30/22

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
      this.numerator = this.numerator * that.getDenominator() + that.getNumerator() * this.denominator;
      this.denominator = this.denominator * that.getDenominator();
      simplifyFraction();
      fixSigns();
   } 

   public void multiplyFraction(Fraction that){//multiplies fract
      this.numerator = this.numerator*that.getNumerator();
      this.denominator = this.denominator * that.getDenominator();
      simplifyFraction();
      fixSigns();
   }  

   public void subtractFraction(Fraction that){//subtract fract
      this.numerator = this.numerator * that.getDenominator() - that.getNumerator() * this.denominator;
      this.denominator = this.denominator * that.getDenominator();
      simplifyFraction();
      fixSigns();
   } 

   private void simplifyFraction(){//simplies the fraction
      int A;
      int B;
      if (numerator > denominator){
         A = numerator;
         B = denominator;
      } else {
         A = denominator;
         B = numerator;
      }
      int R = A % B;
      while (R!=0){
         A = B;
         B = R;
         R = A % B;
      }
      numerator = numerator/B;
      denominator = denominator/B;

   }

   private void fixSigns(){//fixes fraction signs
      if (denominator < 0){
         denominator *= -1;
         numerator *= -1;
      }
   }

}
