package Kadai2.Examples;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("Count: " + count);
    }
}

class Worker implements Runnable {
    private Counter counter;

    public Worker(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(new Worker(counter));
        Thread t2 = new Thread(new Worker(counter));

        t1.start();
        t2.start();
    }
}