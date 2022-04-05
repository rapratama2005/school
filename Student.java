// Rizky Pratama
// Period 4
// 4/5/22

public class Student extends Person //remember to change this and the constructor 
{
   private int grade;
   private double gpa;
   //No main method
   
   public Student(String name, int age, int grade, double gpa){ //change this as well
      super(name, age);
      this.grade = grade;
      this.gpa = gpa;
   }

   public int getGrade(){
      return grade;
   }

   public double getGpa(){
      return gpa;
   }
}
