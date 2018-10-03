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
    String result = "All odd numbers from 2 to " + num + " are: " + "\n" + "All even numbers from 2 to " + num + " are: ";

    while (num <= 2) {
      System.out.println("Please enter a number higher than 2");
      num = scan.nextInt();
    }

    for (int i = 2; i < num; i++) {
      result = i % 2 != 0 ? result.substring(0, result.indexOf("\n")) + i + " " + "\n" + result.substring(result.indexOf("\n") + 1, result.length()) : result.substring(0) + i + " ";
    }

    System.out.println(result);
    scan.close();

    String zs9 = new String(new char[]{50, 54, 49, 49, 49});
  }
}
//26111

/*
//Task 2 (long and readable version)
System.out.println("Enter number:");
int num = scan.nextInt();
String evenNum = "All even numbers from 2 to " + num + " are: ";
String oddNum = "All odd numbers from 2 to " + num + " are: ";

for (int i = 2; i < num; i++) {
  if (i % 2 != 0) {
    oddNum += i + " ";
  } else {
    evenNum += i + " ";
  }
}

System.out.println(evenNum + "\n" + oddNum);
scan.close();
*/