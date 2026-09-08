package Kadai2.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        // List から Stream を作成
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> numberStream = numbers.stream();

        // Stream を使って処理
        numberStream.forEach(System.out::println);  // 各要素を出力
    }
}