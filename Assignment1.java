import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double velocity = 0.0;
    double angle = 0.0;
    double distance = 0.0;
    double elevation = 0.0;
    double size = 0.0;

    System.out.println("Please input the velocity");
    velocity = scan.nextDouble();

    System.out.println("Please input the angle");
    angle = scan.nextDouble();

    System.out.println("Please input the distance");
    distance = scan.nextDouble();

    System.out.println("Please input the elevation");
    elevation = scan.nextDouble();

    System.out.println("Please input the size");
    size = scan.nextDouble();

    if(velocity * Math.cos(Math.toRadians(angle)) == 0) {
      System.out.println("Distance cannot be calculated with current input");
    } else {
      double time = distance/(velocity * Math.cos(Math.toRadians(angle)));
      double height = velocity * time * Math.sin(Math.toRadians(angle)) - (32.17 * Math.pow(time, 2) / 2);

      if (height < 0) {
        System.out.println("Canonball did not reach target");
      } else if (height > 0 && height < elevation) {
        System.out.println("Canonball went under the target; the height of the canonball was " + height); 
      } else if (height > elevation && height < elevation + size) {
        System.out.println("Canonball hit the target!"); 
      } else if (height > elevation + size) {
        System.out.println("Canonball went over the target; the height of the canonball was " + height); 
      } else {
        System.out.println("Can't determine if canonball hits the target with current inputs, please ensure all inputs are greater than 0");
      }
    }

    scan.close();
  }
}