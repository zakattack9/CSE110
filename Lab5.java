import java.util.Scanner;

public class Lab5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number");
    double num1 = scan.nextDouble();

    System.out.println("Enter a second number");
    double num2 = scan.nextDouble();

    System.out.println("Printing sum of two numbers: " + getSum(num1, num2));
    System.out.println("Printing average of two numbers: " + getAverage(num1, num2));

    System.out.println("Enter name");
    scan.nextLine();
    String name = scan.nextLine();

    System.out.println("Enter midterm 1 score");
    double midterm1 = scan.nextDouble();

    System.out.println("Enter midterm 2 score");
    double midterm2 = scan.nextDouble();

    totalGrade1(name, getAverage(midterm1, midterm2));
    totalGrade2(name, midterm1, midterm2);
  }
  
  public static double getSum(double num1, double num2) {
    return num1 + num2;
  }
  
  public static double getAverage(double num1, double num2) {
    return (num1 + num2) / 2;
  }
  
  public static void totalGrade1(String name, double avgScore) {
    System.out.println(name + "'s total grade is: " + avgScore);
  }

  public static void totalGrade2(String name, double midterm1, double midterm2) {
    double grade = getAverage(midterm1, midterm2);
    System.out.println(name + "'s total grade is: " + grade);
  }
}