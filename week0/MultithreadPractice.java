// https://www.tutorialspoint.com/java/java_multithreading.htm

class RunnableDemo implements Runnable{
    private Thread thread;
    private String tName;

    RunnableDemo(String name){
        tName = name;
        System.out.println("Creating " + tName);
    }

    public void start(){
        System.out.println("Starting " + tName);
        if (thread == null){
            thread = new Thread(this, tName);
            thread.start();
        }
    }

    public void run(){
        System.out.println("Running " + tName);

        try{
            for(int i = 4; i > 0; i--){
                System.out.println("Thread: " + tName + ", " + i);

                Thread.sleep(50);
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread " + tName + " interrupted.");
        }

        System.out.println("Thread " + tName + " existing.");
    }
}

class MultithreadingPractice{
    public static void main(String[] args){
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();
    }
}