package homework1;

public class Person {
     private String fullName;
     private int age;


// method move
  public void move(){
      System.out.println("Person " + fullName + " moves");
  }
// method talk
  public void talk(){
      System.out.println("Person " + fullName + " talks");
  }

// getter and setter

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

// constructor

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
