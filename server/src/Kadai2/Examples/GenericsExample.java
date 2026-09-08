package Kadai2.Examples;

class Box<T> { // 🔹 T は汎用的な型パラメータ（Typeの略）
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>(); // 🔥 文字列専用のBox
        stringBox.set("Hello Generics");
        System.out.println("文字列: " + stringBox.get());

        Box<Integer> intBox = new Box<>(); // 🔥 整数専用のBox
        intBox.set(100);
        System.out.println("整数: " + intBox.get());
    }
}
// 出力結果
// 文字列: Hello Generics
// 整数: 100