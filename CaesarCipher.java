// Rizky Pratama
// Period 4
// 3/31/22

public class CaesarCipher //remember to change this and the constructor 
{
   private int shift;
   private String abc = "abcdefghijklmnopqrstuvwxyz";
   private String modAbc = "abcdefghijklmnopqrstuvwxyz";
   //No main method
   
   public CaesarCipher(int shift){ //change this as well
      this.shift = shift % 26;
      for (int i = 0; i < this.shift; i++){
         modAbc = modAbc.substring(1) + modAbc.substring(0, 1);
      }
   }

   public String encrypt(String word){//replaces each letter
      String newWord = " ";
      for (int i = 0; i < word.length(); i++){
         int index = abc.indexOf(word.substring(i, i+1));
         newWord += modAbc.substring(index, index+1);
      }
      newWord = newWord.substring(1);
      return newWord;
   }
}
