package Kadai2.Examples;

class Util {
    public static <T> void printArray(T[] array) { // 🔥 メソッドにジェネリクスを適用
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

public class GenericsMethodExample {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};

        Util.printArray(intArray); // 🔥 整数配列を出力
        Util.printArray(strArray); // 🔥 文字列配列を出力
    }
}
// 出力結果
// 1 2 3 4 5 
// A B C 