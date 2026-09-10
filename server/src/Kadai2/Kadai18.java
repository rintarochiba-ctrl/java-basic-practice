package Kadai2;
//課題18 文字列から数字だけを消し去ろう！
//「Java2026Spring06」という文字列から、すべての数字だけを削除して、アルファベットだけの状態にした結果を出力してください。
public class Kadai18 {// 正規表現の練習
    public static void main(String[] args) {// mainメソッド
        String input = "Java2026Spring06";// 入力文字列
        String result = input.replaceAll("[0-9]", ""); // 数字をすべて削除
        System.out.println("変換後: " + result);// 結果を出力
    }
}
// 出力結果
// 変換後: JavaSpring