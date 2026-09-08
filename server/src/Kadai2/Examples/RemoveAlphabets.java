package Kadai2.Examples;

public class RemoveAlphabets {
    public static void main(String[] args) {
        String input = "Hello123 日本語";
        String result = input.replaceAll("[a-zA-Z]", ""); // 英字を削除
        System.out.println("変換後: " + result);
    }
}
// 出力結果
// 変換後: 123 日本語