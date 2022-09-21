package Multithreading;

public class SleepMethodDemo extends Thread {
    public void run() {
        System.out.println("In run Method");
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SleepImpl {
    public static void main(String[] args) {
        SleepMethodDemo t1 = new SleepMethodDemo();
        SleepMethodDemo t2 = new SleepMethodDemo();
        t1.start();
        t2.start();
    }
}
