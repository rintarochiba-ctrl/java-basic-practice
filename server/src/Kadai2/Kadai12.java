package Kadai2;
//課題12 バラバラの数字を綺麗に並べ替えよう！
//  配列 {5, 2, 8, 3, 9} を昇順（小さい順）に並べ替えて出力してください。
import java.util.Arrays;//Arraysクラスのインストール

public class Kadai12 {//クラスの作成
    public static void main(String[] args) {//mainメソッド
        Integer[] numbers = {5, 2, 8, 3, 9};//Integer型の配列を作成

        // 昇順にソート
        Arrays.sort(numbers);

        // ソート後の配列を表示
        System.out.println(Arrays.toString(numbers));

    }
}