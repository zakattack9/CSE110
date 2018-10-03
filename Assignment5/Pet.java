public class Pet {
  private String name;
  private int age;
  private boolean adopted;

  //Default Constructor
  public Pet () {
    name = "Zak";
    age = 1;
    adopted = true;
  }

  //Regular Constructor
  public Pet (String n, int a) {
    name = n;
    age = a;
    adopted = false;
  }

  //NAME Get/Set
  public String getName () {
    return name;
  }

  public void setName (String newName) {
    name = newName;
  }

  //AGE Get/Set
  public int getAge () {
    return age;
  }

  public void setAge () {
    age++;
  }

  //ADOPTED Get/Set
  public boolean getAdopted () {
    return adopted;
  }

  public void setAdopted () {
    adopted = true;
  }
}