package Kadai2.Examples;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 3, 9};

        // 昇順にソート
        Arrays.sort(numbers);

        // ソート後の配列を表示
        System.out.println(Arrays.toString(numbers));  // [2, 3, 5, 8, 9]

        // 降順にソート
        Arrays.sort(numbers, Collections.reverseOrder());

        // ソート後の配列を表示
        System.out.println(Arrays.toString(numbers));  // [9, 8, 5, 3, 2]
    }
}