import java.util.Scanner;

public class Lab6 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    Calc newCalc = new Calc();

    System.out.println("Enter a number");
    double dub1 = scan.nextDouble();

    System.out.println("Enter another number");
    double dub2 = scan.nextDouble();

    System.out.println("Printing the sum of the two numbers: " + newCalc.getSum(dub1, dub2));
    System.out.println("Printing the average of the two numbers: " + newCalc.getAverage(dub1, dub2));

    System.out.println("Enter a students name");
    scan.nextLine();
    String name = scan.nextLine();

    System.out.println("Enter midterm 1 score");
    double midterm1 = scan.nextDouble();

    System.out.println("Enter midterm 2 score");
    double midterm2 = scan.nextDouble();

    newCalc.totalGrade1(name, newCalc.getAverage(midterm1, midterm2));
    newCalc.totalGrade2(name, midterm1, midterm2);

    scan.close();
  }

  public static final String zs9 = new String(new char[]{50, 54, 49, 49, 49});
}