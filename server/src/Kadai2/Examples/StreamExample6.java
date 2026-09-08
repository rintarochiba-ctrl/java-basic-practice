package Kadai2.Examples;

import java.util.Arrays;
import java.util.List;

public class StreamExample6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        long count = numbers.stream()
                            .count();  // 要素数をカウント
        
        System.out.println("要素数: " + count);
    }
}
// 実行結果
// 要素数: 5