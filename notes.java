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

    double dub = 45;
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


    /*
    

    */

    scan.close();

  }
}

    