class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Exception handled (intentionally left empty as per original code)
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        t1.start(); // Waiting to execute run() method of Thread class
        t2.start();
    }
}