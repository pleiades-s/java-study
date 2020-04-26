// https://www.w3schools.com/java/java_interface.asp

// Interface

interface Animal{
    public void animalSound(); // interface method does not have a body
    public void sleep();
}

// 상속받는 class가 interface method 모두를 implements 해야 한다.
class Pig implements Animal{
    public void animalSound(){
        // The body of animalSound) is provided here
        System.out.println("The pig says: wee wee");
    }

    public void sleep(){
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class MyMainClass{
    public static void main(String[] args){
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
    }
}