import java.util.Scanner;

public class Assignment4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int height;
    boolean diamond = false;
    
    System.out.println("Enter the height of the pyramid");
    height = scan.nextInt();
    
    while (height < 1 || height > 25) {
      System.out.println("Height of the pyramid needs to be greater than 1 and less than 25");
      height = scan.nextInt();
    }
    
    System.out.println("Would you like a diamond instead of a pyramid? (\"Yes\" or \"No\")");
    scan.nextLine(); //prevents scan from tracking enter key
    String yesNo = scan.nextLine();
    
    while (!yesNo.toLowerCase().equals("yes") && !yesNo.toLowerCase().equals("no")) { //equivalent to inputs like "YES, Yes, yes" or "NO, No, no"
      System.out.println("Type in \"Yes\" or \"No\"");
      yesNo = scan.nextLine();
    }
    
    diamond = yesNo.toLowerCase().equals("yes") ? true : false; //ternary statement to set diamond to true is user input "Yes"
    System.out.println(diamond ? "Printing diamond..." : "Printing pyramid..."); //prints messages based on if the user wants a diamond shape
    
    for (int i = height; i > 0; i--) {
      System.out.println(new String(new char[i - 1]).replace("\0", " ") + new String(new char[1 + 2 * (height - i)]).replace("\0", "*"));
    }
    
    if (diamond) {
      for (int i = height - 1; i > 0; i--) { //1 is substracted from height to prevent duplicate row
        System.out.println(new String(new char[height - i]).replace("\0", " ") + new String(new char[i + i - 1]).replace("\0", "*"));
      }
    }
    
    String zs9 = new String(new char[]{50, 54, 49, 49, 49});
  }
}
//26111//

/*
a breakdown of how spaces and stars are calculated and printed out:

CREATING STRINGS WITH SPACES OR STARS:
  new String() //Creates an empty string
  new char[i] //Creates a new character array with "i" being the length of the character array
  new String(new char[i]) //Transforms character array into a single string
  .replace("\0", " ") //Replaces all null characters (unicode: "\0") in string with spaces
  .replace("\0", "*") //Replaces all null characters (unicode: "\0") in string with stars
  new String(new char[i]).replace("\0", " ") //Creates a string with "i" being the amount of spaces in the string
  new String(new char[i]).replace("\0", "*") //Creates a string with "i" being the amount of stars in the string

CALCULATING AMOUNT OF SPACES OR STRINGS:

  FOR PYRAMID SPACES:
  new String(new char[i - 1]).replace("\0", " ") //This builds the correct amount of spaces per row for pyramid shape
  -----
  char[i] => char[i - 1] //Why char[i - 1]?
  i //is the number of characters in a particular row from left to right including the star(s)
  i - 1 //subtracting 1 provides the number of character from left to right not including the star(s)

  FOR PYRAMID STARS:
  new String(new char[1 + 2 * (height - i)]).replace("\0", "*") //This builds the correct amount of stars per row for pyramid shape
  -----
  char[i] => char[1 + 2 * (height - i)] //Why char[1 + 2 * (height - i)]?
  height //total number of stars from left to the middle star
  i //represents number of spaces form left to the first star of the row
  (height - i) //gives the amount of stars that need to be added on left side of the middle star (always increases as loop incrementer decreases)
  2 * (height - i) //multiplied by 2 to add stars on both the left/right sides of middle star
  1 + 2 * (height - i) //adding 1 represents the middle star

  FOR DIAMOND SPACES:
  new String(new char[height - i]).replace("\0", " ") //This builds the correct amount of spaces per row for diamond shape
  -----
  char[i] => char[height - i]] //Why char[height - i]?
  height //in this sense, height represents the number of characters to the middle star (including the middle star)
  i //the number of extra spaces not needed in a row
  height - i //total characters - extra spaces = correct number of spaces per row

  FOR DIAMOND STARS:
  new String(new char[i + i - 1]).replace("\0", "*") //This builds the correct amount of stars per row for diamond shape
  -----
  char[i] => char[i + i - 1] //Why char[i + i - 1]?
  i //half of number of stars in a row
  i + i //total number of stars in a row plus an extra star
  i + i - 1 //subtract 1 to get rid of extra star since there is only one and not two middle stars
*/