import java.util.*;

public class Lab1 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Type in a number");
    int num1 = scan.nextInt();
    System.out.println("You typed in: " + num1);

    System.out.println("Type in a second number");
    int num2 = scan.nextInt();
    System.out.println("You typed in: " + num2);

    System.out.println("Addition = " + (num1 + num2));
    System.out.println("Subtraction = " + (num1 - num2));
    System.out.println("Multiplication = " + (num1 * num2));
    System.out.println("Division = " + (num1 / num2));
    System.out.println("Modulus = " + (num1 % num2));

    scan.close();

    String zs9 = new String(new char[]{50, 54, 49, 49, 49});
  }
}