import java.util.Scanner;

public class test
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in); //need to import package

    //int strInp = scan.nextInt();
    //String input = scan.nextLine(); //allows scanner to take in a string
    //double dblInp = scan.nextDouble();
    //boolean boolInp = scan.nextBoolean();

    /*
    int strInp = scan.nextInt();
    scan.nextLine(); //prevents scan from grabbing the enter
    String input = scan.nextLine();
    System.out.println(input); //waits for user to input a number
    */

    int input = scan.nextInt();
    //int input2 = scan.nextInt(); //can have two scans to gather two lines of user inputted data

    if (input == 0) {
      System.out.println("it was 0");
    } else {
      System.out.println("it was not 0");
    }

    scan.close();

    String one = "hello";
    String two = "hello";
    System.out.println(one.compareTo(two) == 0); //equivalent to ==
    System.out.println(one.equals(two)); //equivalent to .compareTo() == 0
    System.out.println(one.equalsIgnoreCase(two)); //"hello" compared to "Hello" would be true


    int num; //Declaring
    num = 5; //Initializing

    int num2 = 9;
    double num3 = 2.0; //Double
    double num4 = (int)2.0; //converts double back to integer
    double num5 = 0.0 / 1.0;

    String str = "";

    char myChar = 'a'; //every char has an integer number representation

    boolean bool = true;

    int c = 0;
    c = c + 1;
    c += 1; //identical to the line above
    c++;

    System.out.println("Hello, World!" + (num + num2));
    System.out.println(num / num2); //does not return w/decimals
    System.out.println(num / num3); //return w/decimals
    System.out.println(myChar + num2); //return number because char is converted to int
    System.out.println((char)(myChar + num2));

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