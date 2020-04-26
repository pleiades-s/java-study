// https://www.w3schools.com/java/java_inheritance.asp

class Vehicle{
    protected String brand = "Ford"; // To allow Car object to access this attribute
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle{
    private String modelName = "Mustang"; // Car attribute
    public static void main(String[] args){

        // Create a car object
        Car car = new Car();

        // Call the honk() method (from the Vehicle class) on the car object
        car.honk();

        // Display the value of the brand attribute (from the Vehicle class)
        System.out.println(car.brand + " " + car.modelName); // brand는 상속된다.

    }
}