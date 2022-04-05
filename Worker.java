// Rizky Pratama
// Period 4
// 4/5/22

public class Worker extends Person //remember to change this and the constructor 
{
   private String title;
   private int salary;
   //No main method
   
   public Worker(String name, int age, String title, int salary){ //change this as well
      super(name, age);
      this.title = title;
      this.salary = salary;
   }

   public String getTitle(){
      return title;
   }

   public int getSalary(){
      return salary;
   }
}
