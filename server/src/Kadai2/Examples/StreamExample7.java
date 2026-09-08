package Kadai2.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> first = numbers.stream()
                                         .findFirst();  // 最初の要素を取得

        first.ifPresent(System.out::println);  // 存在する場合に出力
    }
}
// 実行結果
// 1
