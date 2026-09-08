package Kadai2;
//課題10 レジ待ちのデータを順番に案内しよう！
//キューにデータ "A", "B", "C", "D", "E" を順番に追加し、その後すべてのデータを順に取り出して出力してください。

import java.util.LinkedList;//LinkedListクラスのインストール
import java.util.Queue;//Queueインターフェースのインストール

public class Kadai10 {//クラスの作成
    public static void main(String[] args) {//mainメソッド
        // Queue の作成
        Queue<String> queue = new LinkedList<>();//Queueインターフェース型の変数にLinkedListで生成したリストを格納(先入れ先出し)

        // キューリストへ要素の追加(offer)
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        // 要素の取得&削除
        while (!queue.isEmpty()) {//リストの中身が空でない間ループ
            String element = queue.poll();//pollで先頭の要素を取り出す
            System.out.println("取り出したデータ: " + element);//コンソール出力
        }

        // Queue の出力(中身が残っていないことを確認)
        System.out.println(queue);
    }
}
