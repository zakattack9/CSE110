import java.util.Scanner;

public class Lab7 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    Student newStudent = new Student();

    System.out.println("Enter student name");
    String newName = scan.nextLine();
    newStudent.setName(newName);

    System.out.println("Enter student major");
    String newMajor = scan.nextLine();
    newStudent.setMajor(newMajor);

    System.out.println("Enter student id");
    int newId = scan.nextInt();
    newStudent.setStudentId(newId);

    System.out.println("Enter student gpa");
    double newGpa = scan.nextDouble();
    newStudent.setGpa(newGpa);

    System.out.println("Enter student age");
    int newAge = scan.nextInt();
    newStudent.setAge(newAge);

    if (newStudent.getAge() >= 6 && newStudent.getAge() <= 11) {
      System.out.println("Student is in Elementary School");
    } else if (newStudent.getAge() >= 12 && newStudent.getAge() <= 14) {
      System.out.println("Student is in Middle School");
    } else if (newStudent.getAge() >= 15 && newStudent.getAge() <= 18) {
      System.out.println("Student is in High School");
    } else {
      System.out.println("Age is not in range");
    }
    
  }

  public static final String zs9 = new String(new char[]{50, 54, 49, 49, 49});
}