package Kadai2.Examples;

import java.util.List;
import java.util.Arrays;

class WildcardExample {
    public static void printList(List<?> list) { // 🔥 どんな型のリストでも受け取れる
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

public class WildcardTest {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<String> strList = Arrays.asList("Hello", "Generics");

        WildcardExample.printList(intList); // 🔥 整数リストを出力
        WildcardExample.printList(strList); // 🔥 文字列リストを出力
    }
}
// 出力結果
// 10 20 30 
// Hello Generics 