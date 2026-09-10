package Kadai2.Examples;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
        public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
               .filter(n -> n % 2 == 0)  // 偶数だけを抽出
               .forEach(System.out::println);  // 出力
    }
}

