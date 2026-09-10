package Kadai2.Examples;

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " running (" + i + ")");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task("Thread-1"));
        Thread thread2 = new Thread(new Task("Thread-2"));

        thread1.start();
        thread2.start();
    }
}
// 出力結果
// Thread-1 running (1)
// Thread-2 running (1)
// (1秒後)
// Thread-1 running (2)
// Thread-2 running (2)
// ...