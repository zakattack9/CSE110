public class Student {
  private String name;
  private String major;
  private int studentId;
  private double GPA;
  private double age;

  public Student () {
    
  }

  public Student(String name, String major, int id, double gpa, double age) {
    this.name = name;
    this.major = major;
    this.studentId = id;
    this.GPA = gpa;
    this.age = age;
  }

  public void setName(String stName) {
    name = stName;
  }

  public String getName() {
    return name;
  }

  public void setMajor(String stMajor) {
    major = stMajor;
  }

  public String getMajor() {
    return major;
  }

  public void setId(int stId) {
    studentId = stId;
  }

  public int getId() {
    return studentId;
  }

  public void setGpa(double stGpa) {
    GPA = stGpa;
  }

  public double getGpa() {
    return GPA;
  }

  public void setAge(double stAge) {
    age = stAge;
  }

  public double getAge() {
    return age;
  }

  public void displayStudent(Student student) {
    System.out.println("Name: " + student.name +  "\nMajor: " + student.major + "\nStudent ID: " + student.studentId + "\nGPA: " + student.GPA + "\nAge: " + student.age);
  }
}