import java.util.Scanner;

public class Assignment2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String originalStr;
    String searchStr;

    System.out.println("Type in an input phrase");
    originalStr = scan.nextLine();

    System.out.println("Type in a search phrase");
    searchStr = scan.nextLine();

    System.out.println("Would you like to consider spaces? (1 (Yes), 0 (No))");
    int spaces = Integer.parseInt(scan.nextLine());

    System.out.println("Would you like to consider uppercase and lowercase letters? (1 (Yes), 0 (No))");
    int upperLower = Integer.parseInt(scan.nextLine());

    if (spaces == 0) {
      originalStr = originalStr.replace(" ", "");
      searchStr = searchStr.replace(" ", "");

    } if (upperLower == 0) {
      originalStr = originalStr.toUpperCase();
      searchStr = searchStr.toUpperCase();

    } if (originalStr.equals(searchStr)) { 
      System.out.println("Search phrase is equal to entire input phrase");

    } else if (!originalStr.contains(searchStr)) {
      System.out.println("Search phrase is not in input phrase");

    } else {
      if (originalStr.startsWith(searchStr)) {
        System.out.println("Search phrase is at the start of input phrase");
      } else if (originalStr.endsWith(searchStr)) {
        System.out.println("Search phrase is at the end of input phrase");
      } else {
        System.out.println("Search phrase starts at index " + originalStr.indexOf(searchStr) + " and ends at index " + (originalStr.indexOf(searchStr) + searchStr.length() - 1));
      }
    }
    // System.out.println(searchStr + originalStr);

    String zs9 = new String(new char[]{50, 54, 49, 49, 49});
  }
}