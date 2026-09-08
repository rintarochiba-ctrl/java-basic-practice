package Kadai2;
//課題10 レジ待ちのデータを順番に案内しよう！
//キューにデータ "A", "B", "C", "D", "E" を順番に追加し、その後すべてのデータを順に取り出して出力してください。
import java.util.LinkedList;
import java.util.Queue;

public class Kadai10 {
    public static void main(String[] args) {
        // Queue の作成
        Queue<String> queue = new LinkedList<>();

        // 要素の追加
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        // 要素の取得&削除
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println("取り出したデータ: " + element);
        }

        // Queue の出力
        System.out.println(queue);
    }
}
