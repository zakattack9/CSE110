import java.util.Scanner;

import javax.sound.midi.Soundbank;

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
    //Data Type Validation
    
    System.out.println("Type in A or B");
    String str = scan.nextLine();

    while (!str.equals("A") && !str.equals("B")) { //validates that user is only inputting A or B
      System.out.println("Plz learn to read");
      str = scan.nextLine();
    }
    System.out.println("Yay! You typed " + str);

    */

    //Switches are much faster than if/else statements
    /*
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
    */

    //Methods
    /*
    printHello();

    String str = scane.nextLine();
    printSomething(str);

    if (flipCoin(false)) {
      System.out.println("Heads");
    }*/

    //Classes
    //Calling Class Attributes
    System.out.println(House.forsale); //will return false even if object is not declared as static variables belong to the class not the object
    
    House myHouse = new House(); //File needs to be in same package
    House myOtherHouse = new House("Green", 5000, -1, 4, 2);
    House myEmptyHouse = null; //Creating empty objects
    myOtherHouse.color = "Blue"; //Can change the value because the class is public

    System.out.println(myHouse.color);
    System.out.println(myOtherHouse.color);
    //System.out.println(myOtherHouse.numWalls); //will not work because numWalls is private
    System.out.println(myOtherHouse.getNumWalls()); //works with the addition of a get method inside class allowing read from the public
    System.out.println(myHouse); //if no method is attached, toString() will be called automatically
  
    //values will be the same because "forsale" is a static variable
    System.out.println(myHouse.forsale);
    System.out.println(myOtherHouse.forsale);

    //Creating a copy using copy constructor
    House copyHouse = new House(myHouse);

    //Arrays
    int[] arr = new int[5]; //initializes empty array that can hold 5 values
    arr[0] = 5;
    System.out.println(arr[0]); //5

    int[] arr2 = {1, 2, 3, 4, 5}; //initializes array with values
    System.out.println(arr2[0]); //1

    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]); //prints out all values of array in order
    }

    //expanding an array
    int[] arrCopy = new int[6]; //create a copy of the array

    for (int i = 0; i < arr2.length; i++) { //loop the original array
      arrCopy[i] = arr2[i]; //assign old values of array to the copy array
    }

    arr2 = arrCopy; //reassign copy to arr2

    //removing two elements from array and making it size 4
    int[] copy = new int[arr.length - 2];

    for (int i = 0; i < copy.length; i++) {
      copy[i] = arr[i + (arr.length - copy.length)];
    }

    arr = copy;

    //removing value at an index provided by the user
    copy = new int[arr.length - 1];
    int indexToRemove = scan.nextInt();
    
    while (indexToRemove < 0 || indexToRemove > arr.length - 1) {
      indexToRemove = scan.nextInt();
    }

    int shift = 0;
    for (int i = 0; i < copy.length; i++) {
      if (i == indexToRemove) {
        shift++;
      }
      copy[i] = arr[i + shift];
    }

    arr = copy;

    //add an element at a specified index
    copy = new int[arr.length + 1];
    System.out.println("Element to add");
    int element = scan.nextInt();
    System.out.println("Index to add at");
    indexToRemove = scan.nextInt();

    while (indexToRemove < 0 || indexToRemove > arr.length) {
      indexToRemove = scan.nextInt();
    }

    shift = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i == indexToRemove) {
        copy[i] = element;
        shift = 1;
      }
      copy[i + 1] = arr[i];
    }

    arr = copy;


    int[] arr3 = {5, 3, 4, 3, 1};
    linearSearch(arr3, 4); //calls linearSearch method and returns index of passed in number



  }

  //Methods
  //methods that aren't void must return a value
  //methods that aren't void can be used in conditional statements or variable assignments

  /*
  public static void printHello() {
    System.out.println("Hello");
  }

  public static void printSomething(String input) {
    System.out.println(input);
  }

  public static int printSomething(int a, int b) {
    c = a + b;
    return c;
  }

  public static boolean flipCoin(boolean coin) {
    return !coin;
  }*/

  //Classes
  //Refer to House.java
  /*
  public class House { //doing give it a main

    // Define Characteristics or Attributes (Instance Variables)
    public String color;
    public double squareFootage;
    public int numStories;
    public int numWalls;
    public int numBedrooms;
    //Just declare do not initialize

    //Constructor
    public House() {
      color = "Red";
      squareFootage = 7;
      numStories = 100;
      numWalls = 300;
      numBedrooms = 0;
    }

  }*/

  // Running Time — Big-Oh O(n) linear time
  public static int linearSearch (int[] arr, int key) { //finding index of value in array
    int index = -1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        index = i;
        break;
      }
    }

    return index;
  }

  // Running Time - O(n^2)
  public static void bubbleSort (int[] arr) { //most simple sort alogrithm
    //the number of times we need to run through the array
    for (int i = 0; i < arr.length; i++) {
      //actually running through the array itself and comparing each element
      for (int j = 0; j < arr.length - i - 1; j++) { //(arr.length - i - 1) prevents checking the last elements in array (makes it faster)
        //comparing each element to the next one
        if (arr[j] > arr[j + 1]) {
          //swap the two elements
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
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

sysout + tab = System.out.println();
*/
    