import java.util.Scanner;

public class Lab2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String firstName = null;
    String lastName = null;
    String fullName = null;
    int age = 0;
    double num1 = 0.0;
    double num2 = 0.0;
    
    System.out.println("Input first name");
    firstName = scan.nextLine();
    
    System.out.println("Input last name");
    lastName = scan.nextLine();
    
    fullName = firstName + " " + lastName;

    System.out.println("Input age");
    age = scan.nextInt();

    System.out.println("Input a number");
    num1 = scan.nextDouble();

    System.out.println("Input a second number");
    num2 = scan.nextDouble();

    System.out.println(fullName + " is " + age + " years old");
    System.out.println("Uppercase full name is " + fullName.toUpperCase());

    if (num1 > num2) {
      System.out.println("Number 1 is bigger than Number 2");
    } else if (num2 > num1) {
      System.out.println("Number 2 is bigger than Number 1");
    } else {
      System.out.println("Number 1 is equal to Number 2");
    }

    scan.close();

    String zs9 = new String(new char[]{50, 54, 49, 49, 49});
  }
}