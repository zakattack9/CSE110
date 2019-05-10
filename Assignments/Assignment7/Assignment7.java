import java.util.Scanner;

public class Assignment7 {
  public static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    MyString string = new MyString();
    System.out.println("Welcome to string searcher");

    String choice = mainMenu();
    while(!choice.equals("d")) {
      if (choice.equals("a")) {
        System.out.println("Enter a string");
        String input = scan.nextLine();
        string = new MyString(input);
      } else if (choice.equals("b")) {
        System.out.println(string.toString());
      } else if (choice.equals("c")) {
        searchString(string);
      }

      choice = mainMenu();
    }
    System.out.println("Thank you for using string searcher");
    
  }

  public static String mainMenu () {
    String menu = "Choose an option:\na. Create a Searchable String\nb. Print the current Searchable String\nc. Search within the String\nd. Quit";
    
    System.out.println(menu);
    String input = scan.nextLine();
    
    while (!input.matches("a|b|c|d")) {
      System.out.println("Input a valid option!\n" + menu);
      input = scan.nextLine();
    }
    
    return input;
  }

  private static void searchString (MyString str) {
    System.out.println("Input string to search for");
    String input = scan.nextLine();

    if (str.indexOf(input) == -1) {
      System.out.println("The search string is not in the MyString");
    } else if (str.equals(input)) {
      System.out.println("The search is identical to the MyString");
    } else if (str.startsWith(input)) {
      System.out.println("The MyString starts with the search string");
    } else if (str.endsWith(input)) {
      System.out.println("The MyString ends with the search string");
    } else {
      System.out.println("The start index of the search within the MyString is " + str.indexOf(input));
    }
  }

}