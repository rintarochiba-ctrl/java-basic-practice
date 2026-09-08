package Kadai2.Examples;

import java.util.Arrays;
import java.util.List;

public class StreamExample4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);  // 合計を計算
        
        System.out.println("合計: " + sum);
    }
}
// 実行結果
// 合計: 15