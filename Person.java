// Rizky Pratama
// Period 4
// 4/13/22

public class Person //remember to change this and the constructor 
{
   private String name;
   private int age;
   //No main method
   
   public Person(String name, int age){ //change this as well
      this.name = name;
      this.age = age;
   }

   public String getName(){//getnmae
      return name;
   }

   public int getAge(){//getage
      return age;
   }

   public String toString(){//toString
      return name + " is " + age + " years old";
   }

   public boolean equals(Person that){//compares
      if(this.getName().equals(that.getName()) && this.getAge()==that.getAge()){
         return true;
      } else {
         return false;
      }
   }
}
