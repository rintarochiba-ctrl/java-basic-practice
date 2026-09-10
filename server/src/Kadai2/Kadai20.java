package Kadai2;
//課題20 万能の型枠（ジェネリクス）を自分で作ってみよう！
//型を自由に指定できる Box クラスを作成してください。その後、メイン処理の中で「整数（Integer）」を格納する箱と、「文字列（String）」を
// 格納する箱をそれぞれ1つずつ生成し、値をセットして取り出した結果を出力してください。

class Box<T> { //T は汎用的な型パラメータ（Typeの略）
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class Kadai20 {//クラスの作成
    public static void main(String[] args) {//mainメソッド
        Box<Integer> intBox = new Box<>(); //整数専用のBox 自動生成されたコンストラクタを呼び出す
        intBox.set(100);//setメソッドで値を格納
        System.out.println("整数: " + intBox.get());//getメソッドで値を取り出して出力

        Box<String> stringBox = new Box<>(); //文字列専用のBox
        stringBox.set("Hello World");//setメソッドで値を格納
        System.out.println("文字列: " + stringBox.get());//getメソッドで値を取り出して出力
    }
}
// 出力結果
// 整数: 100
// 文字列: Hello World