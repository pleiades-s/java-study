class OperationExample
{
    public static void main(String[] args)
     {
       System.out.println("Variables");
       Variables();
       DataType();
       Operations();
       Strings();
     }

    //https://www.w3schools.com/java/java_variables.asp
    private static void Variables(){
        
        String name = "john";
        System.out.println("String type: " + name);

        int myNum = 15;
        System.out.println("Integer type: " + String.valueOf(myNum));

        myNum += 5;
        System.out.println("Plus five -> " + String.valueOf(myNum));

        final int readOnlyInt = 10;
        System.out.println("final variable: " + String.valueOf(readOnlyInt));

        // readOnlyInt += 5; throws a compile error

        
        float floatNum = 3.99f;
        boolean IsChecked = true;
        char myLetter = 'a';

        System.out.println("Float type: " + String.valueOf(floatNum));
        System.out.println("Boolean type: " + String.valueOf(IsChecked));
        System.out.println("Character type: " + String.valueOf(myLetter));

    }

    // https://www.w3schools.com/java/java_data_types.asp
    private static void DataType(){
    
        byte myByte = 100;
        System.out.println("Byte type");
        System.out.println(myByte);

        short myShort = 5000;
        System.out.println("Short type");
        System.out.println(myShort);

        int myInt = 100000;
        System.out.println("Int type");
        System.out.println(myInt);

        // Note that you should end the Long value with an "L"
        long myLong = 15000000000L;
        System.out.println("Long type");
        System.out.println(myLong);

        // Note that you should end the float value with an "f":
        float myFloat = 5.75f;
        System.out.println("Float type");
        System.out.println(myFloat);

        // Note that you should end the double value with a "d"
        double myDouble = 19.99d;
        System.out.println("Double type");
        System.out.println(myDouble);

        // A floating point number can also be a scientific number with an "e" to indicate the power of 10:
        float f1 = 35e+4f;
        double d1 = 12e-4d;
        System.out.println("Floating point number with 'e'");
        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        System.out.println("Boolean type");
        System.out.println(isJavaFun);

        char myChar = 'A';
        System.out.println("Character type");
        System.out.println(myChar);

        // ASCII value
        char a = 66;
        System.out.println(a);

        String myString = "Java string";
        System.out.println("String type");
        System.out.println(myString);
    }

    // https://www.w3schools.com/java/java_operators.asp
    private static void Operations(){
        
        // Assignment Operator
        int x = 100 + 50;

        int y = 100;
        y += 50;

        System.out.format("Addition %d = %d", x, y);


        // Comparison Operators

        if (x == y){
            System.out.println("x equals to y");
        }
        else{
            System.out.println("x does not equal to y");
        }

        // Logical Operators
        if (x == y && x > 0){
            System.out.println("x == y and x > 0");
        }
        else{
            System.out.println("If condition is not satified.");
        }
        

    }

    private static void Strings(){

        String myString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the text string is " + myString.length());

        myString = "Hello World";
        System.out.println("toUpperCase: " + myString.toUpperCase());
        System.out.println("toLowerCase: " + myString.toLowerCase());

        System.out.format("Where is World: %d\n", myString.indexOf("World"));

        String firstName = "John";
        String lastName = "Doe";

        System.out.println("String concatenate");
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.format("Inserting Quote: %s\n", txt);

        System.out.println("If you add a number and a string, the result will be a string concatenation");
        String x = "10";
        int y = 20;
        String z = x + y;
        System.out.format("String %s + int %d = String %s\n", x, y, z);

    }
}