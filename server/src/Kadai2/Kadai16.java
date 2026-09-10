package Kadai2;
//課題16 裏で定期的に叫ぶスレッドを作ってみよう！
//メインの処理とは別に、裏で「1秒間隔」で Hello, World! と合計5回出力して終了するような、独立したスレッドを作って起動させてください。
// Thread クラスを継承した独自のクラスを作成

class MyThread extends Thread {//マルチスレッド処理のためのThreadクラスを継承
    @Override//親クラスを再定義するアノテーション
    public void run() {//1秒ごとにコンソール出力するメソッド
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello, World! (" + i + ")");
            try {
                Thread.sleep(1000); // 1秒間隔で待機
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Kadai16 {
    public static void main(String[] args) {
        // スレッドのインスタンスを作成
        MyThread thread = new MyThread();

        thread.start();//runに書き換えた処理は裏で動く。startで実行する処理は表で平行に行われる。

        System.out.println("メイン処理は裏で動くスレッドを待たずに進む");//コンソール出力
    }
}