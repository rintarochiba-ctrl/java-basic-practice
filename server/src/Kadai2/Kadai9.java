package Kadai2;
//課題9 積んだデータを上から順に取り出そう！
//数値 1, 2, 3, 4, 5 を順番にプッシュ（追加）した後、すべての要素をポップ（取り出して削除）して出力してください。
import java.util.Stack;

public class Kadai9 {
        public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 要素の追加（積み上げる＝push）
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5); // 5が一番上にある状態

        // 要素の取得＆削除（一番上から取る＝pop）
        while (!stack.isEmpty()) {//スタックが空でない間繰り返す
            int top = stack.pop();
            System.out.println("取り出したデータ: " + top);
        }
        System.out.println("残りのスタック: " + stack);//スタックが空になったことを確認
    }
}

