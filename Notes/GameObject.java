/*
  Example of an object in 3D space that is either, Healthy, Dead, or Injured
*/

public class GameObject {
  private double x;
  private double y;
  private double z;

  private final int Healthy = 2;
  private final int Injured = 1;
  private final int Dead = 0;

  private int state;

  public GameObject () {
    x = 0;
    y = 0;
    z = 0;
    state = Healthy;
  }

  public GameObject(double newX, double newY, double newZ, int newState) {
    x = newX;
    y = newY;
    z = newZ;
    if (newState == Healthy || newState == Injured || newState == Dead) {
      state = newState;
    } else {
      state = Healthy;
    }
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getZ() {
    return z;
  }
}