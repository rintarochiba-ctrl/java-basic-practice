package Kadai2.Examples;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 要素の追加（積み上げる＝push）
        stack.push(1);
        stack.push(2);
        stack.push(3); // 3が一番上にある状態
        
        // 要素の取得＆削除（一番上から取る＝pop）
        int top = stack.pop();

        System.out.println("取り出したデータ: " + top); // 3
        System.out.println("残りのスタック: " + stack); // [1, 2]
    }
}