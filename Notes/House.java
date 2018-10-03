//Classes
public class House { //doing give it a main

  // Define Characteristics or Attributes (Instance Variables)
  public String color; //by making this attribute private, you can't change the value of color
  public double squareFootage;
  public int numStories;
  private int numWalls;
  public int numBedrooms;
  int numBathrooms; //by not including public/private in front it defaults to private
  //Just declare do not initialize
  //When a variable is public anybody can see it and change it
  //When a variable is private it can only be seen and changed within the class

  //Default Constructor
  public House() {
    color = "Red";
    squareFootage = 7;
    numStories = 100;
    numWalls = 300;
    numBedrooms = 0;
  }

  //Regular Constructor
  public House(String c, double sf, int s, int w, int b) {
    color = c;
    squareFootage = s;
    numStories = s;
    numWalls = w;
    numBedrooms = b;
  }

  //Methods

  //Get
  public int getNumWalls() { //allows public access to read num walls, though it is a private variable
    return numWalls;
  }

  //Set
  public void setNumWalls(int newWalls) {
    numWalls = newWalls;
  }

}