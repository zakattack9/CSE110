import java.util.Scanner;
import java.util.Random;

public class notes
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    
    /*
    rand.nextInt(10) //gives random number from 0-9
    */

    double dub = 45; //regular double
    final double dubConst = 0; //constant double (can't be changed)
    final String strConst = "Hello World"; //constant String (can't be changed)
    final int intConst = 1; //constant integer (can't be changed)

    /*
    //Math Methods

    Math.toRadians(dub) //converts to radians
    Math.toDegrees(dub) //converts to degrees
    Math.cos(dub) //returns cosine of inputted number
    Math.sin(dub) //returns sine of inputted number
    Math.tan(dub) //returns tangent of inputted number
    Math.abs(dub) //takes absolute value of number
    Math.pow(dub, 2) //raises first param to the power of second param
    Math.sqrt(dub) //takes square root of number
    Math.cbrt(dub) //takes cube root of number
    Math.max(1, 0) //returns greater number of the two arguments
    Math.min(1, 0) //reutrns lesser number of the two arguments
    Math.round() //rounds number to nearest whole number

    Math.PI //value of pi
    Math.E //value of e

    */

    /*
    //Escape Characters

    System.out.println("Hello \nWorld"); /breaks to a new line
    System.out.println("Hello \"World\""); //adds "
    System.out.println("Hello \\World"); //adds \
    System.out.println("Hello \tWorld"); //adds tab
    
    */

    
    /* 
    //String Methods

    String str = scan.nextLine();

    str.indexOf()
    str.toUpperCase()
    str.toLowerCase()
    str.equals()
    str.contains()
    str.startsWith()
    str.endsWith()
    str.charAt()
    str.substring(index) //takes index to the end (can take two parameter)
    str.replace() //takes two strings and replaces first string with second string

    //Convert string to different types
    String str = "9";
    int num = Integer.parseInt(str);
    System.out.println(num * 2);

    System.out.println(Double.parseDouble(str));
    System.out.println(Boolean.parseBoolean(str));

    // int, double, boolean (primitive types)
    // String, Double, Boolean, Integer (object types)


    //Integers
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MAX_VALUE + 1); //overflows and starts at MIN_VALUE
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MIN_VALUE - 1); //underflows and starts at MIN_VALUE


    */

    //scan.close(); //used to tell the program to stop accepting inputs

    /* 
    //Loops

    //WHILE LOOP
    int count = 0;
    while (count <= 30) {
      //count += 10; //adding the incrementer before the print, outputs up to "Count is 10"
      System.out.println("Count is " + count);
      count += 10; //adding the incrementer after the print, outputs up to "Count is 9"
      //break //stops the loop
    }

    //DO WHILE LOOP
    int count = 0;
    int num;
    //ensures code runs at least once
    do { //runs code inside BEFORE running while loop
      count++;
      num = 0;
    } while (count < 10);
    System.out.println(num);

    //FOR LOOP
    for (int i = 0; i < 10; i++) {
      //runs code 10 times
    }
    
    SIDE NOTE:
    count++ //will print numbers starting from 0 ex.(0-9)
    ++count //will print numbers starting from 1 ex.(1-10)

    */

    /* 
    //Data Typer Validation
    
    System.out.println("Type in A or B");
    String str = scan.nextLine();

    while (!str.equals("A") && !str.equals("B")) { //validates that user is only inputting A or B
      System.out.println("Plz learn to read");
      str = scan.nextLine();
    }
    System.out.println("Yay! You typed " + str);

    */

    //Switches are much faster than if/else statements
    switch (scan) { //switch with inputs
      case 0: //else if input == 0
        System.out.println("Typed 0");
        break; //needs break otherwise it will run all subsequent cases
      case 1: //else if input == 1
        System.out.println("Typed 1");
        break;
      case 2: //else if input == 2
        System.out.println("Typed 2");
        break;
      default: //else statement (runs this if all other cases aren't true)
        System.out.println("Default");
    }

    switch (str) { //switch with string
      case "Hello": //much more condensed than (str == "Hello")
        break;
      case "This": //by not adding a break in this case, it acts as an or || statement
      case "That": //if str is "This" or "That", it will print the string below 
        System.out.println("This or That");
        break;

    }

  }
}

/*
Signatures:
String zs9 = new String(new char[]{122, 97, 107}) + 26 + new String("00000").replace("0", "1").substring(1, 4); //zak26111
String zs9 = new String(new char[]{50, 54, 0, 0, 0}).replace("\0", "1"); //26111
String zs9 = new String(new char[]{50, 54, 49, 49, 49}); //26111
String zs9 = new String(new char[]{122, 97, 107, 50, 54, 0, 0, 0}).replace("\0", "1"); //zak26111
String zs9 = new String(new char[]{122, 97, 107, 50, 54, 0, 0, 0}).replace("\0", "1").substring(3); //26111
*/
    