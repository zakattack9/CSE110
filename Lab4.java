import java.util.*;

public class Lab4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //Task 1
    for (String star = "*"; star.length() <= 10; star += "*") {
      System.out.println(star);
    }

    //Task 2
    System.out.println("Enter number:");
    int num = scan.nextInt();
    String evenNum = "All even numbers from 2 to " + num + " are: ";
    String oddNum = "All odd numbers from 2 to " + num + " are: ";

    while (num <= 2) {
      System.out.println("Please enter a number higher than 2");
      num = scan.nextInt();
    }

    for (int i = 2; i < num; i++) {
      if (i % 2 != 0) {
        oddNum += i + " ";
      } else {
        evenNum += i + " ";
      }
    }

    System.out.println(evenNum + "\n" + oddNum);
    scan.close();

    String zs9 = new String(new char[]{50, 54, 49, 49, 49});
  }
}
//26111