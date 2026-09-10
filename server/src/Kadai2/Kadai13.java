package Kadai2;
//課題13 矢印（->）を使って処理を短く書いてみよう！
//2つの整数を引数として受け取り、その「積（掛け算）」を計算する処理をラムダ式で作成し、実際に数字を渡して計算結果を出力してください。

import java.util.function.BiFunction;//BiFunctionクラスのインストール

public class Kadai13 {//クラスの作成
    public static void main(String[] args) {//mainメソッド
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;//BiFunctionは2つの整数を受け取り整数を返す

        System.out.println(multiply.apply(10, 4));//BiFunctionで作ったメソッドはそのままでは実行できないためapplyで実行
    }
}
