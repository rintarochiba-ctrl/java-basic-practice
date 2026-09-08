package Kadai2.Examples;

import java.util.function.BiFunction;//引数を2つ受け取り、結果を返す関数型インターフェース

public class LambdaExample2 {
    public static void main(String[] args) {
        // 2つの整数を掛け算するラムダ式
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // 計算して出力
        System.out.println(multiply.apply(5, 3)); // 15
    }
}