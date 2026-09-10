package Kadai2.Examples;

public class NormalizeSpaces {
    public static void main(String[] args) {
        String input = "これは    テスト    です。";
        String result = input.replaceAll("\\s+", " "); // 連続した空白を1つに
        System.out.println("変換後: " + result);
    }
}
// 出力結果
// 変換後: これは テスト です。