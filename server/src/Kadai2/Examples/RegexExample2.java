package Kadai2.Examples;

public class RegexExample2 {
    public static void main(String[] args) {
        String input = "こんにちはHelloワールド!";
        String result = input.replaceAll("[ぁ-んァ-ン]", ""); // ひらがな・カタカナ削除
        System.out.println("変換後: " + result);
    }
}
// 出力結果
// 変換後: Helloー!