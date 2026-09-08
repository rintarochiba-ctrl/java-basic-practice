package Kadai2.Examples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue の作成
        Queue<String> queue = new LinkedList<>();

        // 要素の追加
        queue.offer("hoge");
        queue.offer("huga");
        queue.offer("hige");

				// 要素の取得&削除
				queue.poll();

        // Queue の出力
        System.out.println(queue);
    }
}
// 実行結果
// ["huga", "hige"]

