public class Student {
  String name;
  String major;
  int studentId;
  double gpa;
  int age;

  public void setName (String newName) {
    name = newName;
  }

  public String getName() {
    return name;
  }

  public void setMajor (String newMajor) {
    major = newMajor;
  }

  public String getMajor () {
    return major;
  }

  public void setStudentId (int newId) {
    studentId = newId;
  }
  
  public int getStudentId () {
    return studentId;
  }

  public void setGpa (double newGpa) {
    gpa = newGpa;
  }

  public double getGpa () {
    return gpa;
  }

  public void setAge (int newAge) {
    age = newAge;
  }

  public int getAge () {
    return age;
  }
}