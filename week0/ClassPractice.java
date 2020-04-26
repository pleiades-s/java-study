// https://www.w3schools.com/java/java_class_methods.asp

public class ClassPractice {

    String name;
    // Constructor
    public ClassPractice(String name){
        this.name = name;
    }

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

  // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method, constructor
    // myPublicMethod(); This would compile an error

    ClassPractice myObj = new ClassPractice("Sungyoun"); // Create an object of ClassPractice
    System.out.println("ClassPractice name: " + myObj.name);
    myObj.myPublicMethod(); // Call the public method on the object
  }
}

