package Kadai2.Examples;

class NumberBox<T extends Number> { // 🔥 Numberのサブクラスのみ許可
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public double getDoubleValue() {
        return value.doubleValue(); // 🔥 数値として処理
    }
}

public class GenericsBoundExample {
    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.set(50);
        System.out.println("整数の値: " + intBox.get() + ", 小数変換: " + intBox.getDoubleValue());

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.set(12.34);
        System.out.println("小数の値: " + doubleBox.get() + ", 小数変換: " + doubleBox.getDoubleValue());

        // NumberBox<String> strBox = new NumberBox<>(); // ❌ エラー（StringはNumberのサブクラスではない）
    }
}
// 出力結果
// 整数の値: 50, 小数変換: 50.0
// 小数の値: 12.34, 小数変換: 12.34