package Kadai2.Examples;

import java.util.Arrays;
import java.util.List;

public class StreamExample5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 4);

        numbers.stream()
               .sorted()  // 昇順に並べ替え
               .forEach(System.out::println);  // 出力
    }
}
// 実行結果
// 1
// 3
// 4
// 5
// 8
