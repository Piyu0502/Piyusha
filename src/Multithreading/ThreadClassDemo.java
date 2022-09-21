package Multithreading;

public class ThreadClassDemo extends Thread {
    public void run() {
        System.out.println("Thread is in running state");
    }
}

class ThreadClassImpl {
    public static void main(String[] args) {
        ThreadClassDemo t1 = new ThreadClassDemo();
        t1.start();
    }
}
