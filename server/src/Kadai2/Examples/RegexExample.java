package Kadai2.Examples;

public class RegexExample {
    public static void main(String[] args) {
        String input = "Hello123 World456!";
        String result = input.replaceAll("[0-9]", ""); // 数字をすべて削除
        System.out.println("変換後: " + result);
    }
}
// 出力結果
// 変換後: Hello World!