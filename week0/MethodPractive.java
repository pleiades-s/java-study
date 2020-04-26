class MethodPractice{
    public static void main(String[] args){

        // if (args.length != 2){
        //     System.out.println("Two number arguments are needed.");
        //     System.exit(0);
        // }

        // try{
        //     myMethod(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        // }

        // catch(Exception e){
        //     System.out.println("Two number arguments are needed.");
        // }

        int myInt = myMethod(5, 15);
        float myFloat = myMethod(4.5f, 5.5f);


        System.out.println("Method overloading");
        System.out.format("5 + 15 = %d\n", myInt);
        System.out.format("4.5 + 5.5 = %.2f\n", myFloat);
    }

    // Method overloading: Multiple methods with same name
    static int myMethod(int x, int y){
        return x + y;
    }

    static float myMethod(float x, float y){
        return x + y;
    }

}