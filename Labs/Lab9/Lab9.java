import java.util.Scanner;

public class Lab9 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //all setters are able to be called from main
    //no getters can be called from main because these methods are private
    
    Student student1 = new Student("Zak", "Comp Sci", 9, 4.0, 18);
    Student student2 = new Student("Zak", 9, 18);

    student1.displayStudent(student1);
    student1.displayStudent(student2);
  }
}