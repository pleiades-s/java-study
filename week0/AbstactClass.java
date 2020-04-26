// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound(); // 상속 class는 이를 구현해야 함.
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() { // Override 해야 함.
    // The body of animalSound() is provided here!!
    System.out.println("The pig says: wee wee");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}