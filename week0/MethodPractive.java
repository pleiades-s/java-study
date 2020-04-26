class MethodPractice{
    public static void main(String[] args){

        if (args.length != 2){
            System.out.println("Two number arguments are needed.");
            System.exit(0);
        }

        try{
            myMethod(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        }

        catch(Exception e){
            System.out.println("Two number arguments are needed.");
        }
    }

    static void myMethod(int x, int y){
        System.out.format("x + y = %d\n", x + y);
    }

}