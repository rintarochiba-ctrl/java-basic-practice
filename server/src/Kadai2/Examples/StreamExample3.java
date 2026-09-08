package Kadai2.Examples;

import java.util.Arrays;
import java.util.List;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
               .map(n -> n * 2)  // 各要素を 2 倍に変換
               .forEach(System.out::println);  // 出力
    }
}