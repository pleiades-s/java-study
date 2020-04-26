// https://www.w3schools.com/java/java_encapsulation.asp

class Person{
    private String name; // private attribute

    // Getter
    public String getName(){
        return name;
    }

    // Setter
    public void setName(String newName){
        this.name = newName;
    }
}

class MyClass{
    public static void main(String[] args){
        Person person = new Person();
        // person.name = "John";
        person.setName("John");
        System.out.println(person.getName());


    }
}