package Kadai2.Examples;

import java.util.regex.*;

public class ExtractHiragana {
    public static void main(String[] args) {
        String text = "こんにちは、Hello!";
        Pattern pattern = Pattern.compile("[ぁ-ん]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("見つかったひらがな: " + matcher.group());
        }
    }
}
// 出力結果
// 見つかったひらがな: こんにちは