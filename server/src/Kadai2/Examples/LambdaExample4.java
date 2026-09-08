package Kadai2.Examples;

import java.util.Arrays;
import java.util.List;

public class LambdaExample4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        // 名前の長さ順にソート
        names.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println(names);  // [Bob, John, Alice]
    }
}