public class Calc {
 
  // Empty Default Constructor
  public Calc () {

  }

  public double getSum (double dub1, double dub2) {
    return dub1 + dub2;
  }

  public static double getAverage (double dub1, double dub2) {
    return (dub1 + dub2) / 2;
  }

  public static void totalGrade1 (String name, double average) {
    System.out.println(name + " has an average grade of " + average);
  }

  public static void totalGrade2 (String name, double midterm1, double midterm2) {
    double grade = getAverage(midterm1, midterm2);
    System.out.println(name + " has an average grade of " + grade);
  }
}