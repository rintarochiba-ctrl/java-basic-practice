package Kadai2.Examples;

import java.util.regex.*;

public class ExtractEmail {
    public static void main(String[] args) {
        String text = "私のメールは example@gmail.com です。連絡してください！";
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("見つかったメールアドレス: " + matcher.group());
        } else {
            System.out.println("メールアドレスが見つかりませんでした");
        }
    }
}
// 出力結果
// 見つかったメールアドレス: example@gmail.com