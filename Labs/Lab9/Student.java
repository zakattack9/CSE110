public class Student {
  private String name;
  private String major;
  private int studentId;
  private double GPA;
  private double age;

  public Student () {
    name = "";
    major = "";
    studentId = 0;
    GPA = 0;
    age = 0;
  }

  public Student (String name, String major, int studentId, double GPA, double age) {
    this.name = name;
    this.major = major;
    this.studentId = studentId;
    this.GPA = GPA;
    this.age = age;
  }

  public Student (String name, int studentId, double age) {
    this.name = name;
    this.studentId = studentId;
    this.age = age;
  }

  public void setName(String stName) {
    name = stName;
  }

  private String getName() {
    return this.name;
  }

  public void setMajor(String stMajor) {
    major = stMajor;
  }

  private String getMajor() {
    return this.major;
  }

  public void setStudentID(int stStudentID) {
    studentId = stStudentID;
  }

  private int getStudentID() {
    return this.studentId;
  }

  public void setGPA(double stGPA) {
    GPA = stGPA;
  }

  private double getGPA() {
    return this.GPA;
  }

  public void setAge(double stAge) {
    age = stAge;
  }

  private double getAge() {
    return this.age;
  }

  public void displayStudent (Student sCopy) {
    System.out.println(sCopy.name + " " + sCopy.major + " " + sCopy.studentId + " " + sCopy.GPA + " " + sCopy.age);
  }
}