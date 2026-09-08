package Kadai2.Examples;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello, World! (" + i + ")");
            try {
                Thread.sleep(1000); // 1秒待機
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread(); // スレッドのインスタンス作成
        thread.start(); // スレッドを開始
    }
}
// 出力結果
// Hello, World! (1)
// (1秒後)
// Hello, World! (2)
// (1秒後)
// Hello, World! (3)
// ...