package Kadai2.Examples;
//例
public class MethodOverloadExample {
    // 引数が2つ（整数型）
    public int add(int a, int b) {
        return a + b;
    }

    // 引数が3つ（整数型）
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 引数が2つ（小数型）
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadExample example = new MethodOverloadExample();

        // 2つの整数を加算
        System.out.println(example.add(3, 4)); // 7

        // 3つの整数を加算
        System.out.println(example.add(1, 2, 3)); // 6

        // 2つの小数を加算
        System.out.println(example.add(2.5, 3.5)); // 6.0
    }
}
