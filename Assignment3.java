import java.util.Scanner;

public class Assignment3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int countInp = 0;
    double sumInp = 0;
    double lastInp;

    double highInp = Double.NaN;
    double lowInp = Double.NaN;

    do {
      System.out.println("Input a number, enter 0 to exit");
      lastInp = scan.nextDouble();

      if (lastInp == 0 && countInp == 0) {
        System.out.println("First input can't be 0");
        lastInp = Double.NaN;
      } else {
        if (lastInp == 0) {
          break;
        } else {
          sumInp += lastInp;
          countInp++;

          if (countInp == 1) {
            highInp = lastInp;
            lowInp = lastInp;
          } if (lastInp > highInp) {
            highInp = lastInp;
          } if (lastInp < lowInp) {
            lowInp = lastInp;
          }
        }
      }
    } while (lastInp != 0);

    System.out.println("Sum of inputs: " + sumInp);
    System.out.println("Total number of inputs: " + countInp);
    System.out.println("Average of your inputs: " + (sumInp / countInp));
    System.out.println("Highest inputs: " + highInp);
    System.out.println("Lowest inputs: " + lowInp);
  }
}