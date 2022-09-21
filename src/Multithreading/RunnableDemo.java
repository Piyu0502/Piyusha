package Multithreading;

public class RunnableDemo implements Runnable {
    public void run() {
        System.out.println("Thread is in running state");
    }
}

class RunnableImpl {
    public static void main(String[] args) {
        RunnableDemo t1 = new RunnableDemo();
        Thread thread = new Thread(t1);
    }
}