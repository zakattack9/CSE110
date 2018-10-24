import java.util.Scanner;

public class Lab8 {
  public static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    Student student = new Student();

    student.setName("Zak");
    student.setMajor("Computer Science");
    student.setId(9);
    student.setGpa(4.0);
    student.setAge(18);

    System.out.println(makeStudent("Zak", "CS", 9, 4.0, 18));

    Student testSt = inputStudent();
    System.out.println(testSt);
  }

  public static Student makeStudent(String name, String major, int id, double gpa, double age) {
    Student tempStudent = new Student();
    tempStudent.setName(name);
    tempStudent.setMajor(major);
    tempStudent.setId(id);
    tempStudent.setGpa(gpa);
    tempStudent.setAge(age);

    tempStudent.getName();
    return tempStudent;
  }

  public static Student inputStudent() {
    System.out.println("Input name");
    String name = scan.nextLine();

    System.out.println("Input major");
    String major = scan.nextLine();

    System.out.println("Input id");
    int id = scan.nextInt();

    System.out.println("Input GPA");
    double gpa = scan.nextDouble();

    System.out.println("Input age");
    double age = scan.nextDouble();

    return makeStudent(name, major, id, gpa, age);
  }
}