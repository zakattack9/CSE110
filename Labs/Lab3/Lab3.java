import java.util.*;

public class Lab3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Input a score");
    double score = scan.nextDouble();

    if (score >= 90) {
      System.out.println("Graded as an A");
    } else if (score < 90 && score >= 80) {
      System.out.println("Graded as an B");
    } else if (score < 80 && score >= 60) {
      System.out.println("Graded as an C");
    } else {
      System.out.println("Graded as an D");
    }

    System.out.println("Input another score");
    int score2 = scan.nextInt();
    
    while (score2 >= 0) {
      switch (score2 / 10) {
        case 9:
          System.out.println("A Grade");
          break;
        case 8:
          System.out.println("B Grade");
          break;
        case 7: //!!! case meant to flow to following case
        case 6:
          System.out.println("C Grade");
          break;
        default:
          System.out.println("D Grade");
          break;
      }
      score2 = scan.nextInt();
    }
    System.out.println("Please enter a valid score");

    scan.close();
    
    String zs9 = new String(new char[]{50, 54, 49, 49, 49});
  }
}