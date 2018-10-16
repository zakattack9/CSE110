//Classes
public class House { //doing give it a main
  //Static (common value for all objects of class)
  public static boolean forsale = false; //if changed, all objects will be affected by the new value
  //don't put static instance variables in constructors as they would reset the value every time a new object is made

  // Define Characteristics or Attributes (Instance Variables)
  public Color color; //uses enum to restrict values
  public double squareFootage;
  public int numStories;
  public String id;
  private int numWalls; //by making this attribute private, you can't change the value of numWalls
  public int numBedrooms;
  int numBathrooms; //by not including public/private in front it defaults to private
  //Just declare do not initialize
  //When a variable is public anybody can see it and change it
  //When a variable is private it can only be seen and changed within the class

  //Default Constructor
  public House () {
    color = Color.Red; //assigning a value from an enum (limits the type of valid values for a variable)
    squareFootage = 7;
    numStories = 100;
    numWalls = 300;
    numBedrooms = 0;
  }

  //Regular Constructor
  public House (Color c, double sf, int s, int w, int b) { //using Color as a value type
    color = c;
    squareFootage = s;
    numStories = s;
    numWalls = w;
    numBedrooms = b;
  }

  //Copy Constructor (Made specifically for making copies of object)
  public House (House toCopy) {
    color = toCopy.color;
    squareFootage = toCopy.getNumWalls();
    numStories = toCopy.numStories;
    numWalls = toCopy.numWalls;
    numBedrooms = toCopy.numBedrooms;
  }


  //Methods

  //Get
  public int getNumWalls () { //allows public access to read num walls, though it is a private variable
    return numWalls;
  }

  //Set
  public void setNumWalls (int newWalls) {
    numWalls = newWalls;
  }

  //This is called automatically
  public String toString () {
    return "The nuumber of walls is " + numWalls;
  }

  public static void printStuff () {
    //static methods can only access other static methods and static instance variables
  }

  //Can have multiple methods with same name but it needs to take in different parameter types
  //Method Overloading
  public void setId (String newId) {
    id = newId;
  }

  public void setId (int newId) {
    setId("" + newId); //just converts input to proper value
  }

  public void setId (double newId) {
    setId((int)newId); //converts to int and invokes the setId method above
  }
  //Method Overloading allows handling of multiple variable types
}
