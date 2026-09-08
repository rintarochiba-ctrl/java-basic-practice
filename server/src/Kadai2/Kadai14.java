package Kadai2;
//課題14 今の時間を綺麗に表示してみよう！
//プログラムを実行した瞬間の「現在の日付と時刻」を取得し、以下の形式に整えてコンソールに出力してください。 出力形式： YYYY-MM-DD HH:mm:ss （例：2024-12-25 10:05:30）

import java.time.LocalDateTime;//LocalDateTimeクラスのインストール
import java.time.format.DateTimeFormatter;//DtaTimeFormatterクラスのインストール

public class Kadai14 {//クラスの作成
    public static void main(String[] args) {//mainメソッド
        LocalDateTime now = LocalDateTime.now();//LocalDateTimeのnow()メソッドで現在の日時を取得

        // DateTimeFormatterクラスのofPatternメソッドでフォーマット指定
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:ss");

        // フォーマットして出力
        String formattedDateTime = now.format(formatter);//Stringクラスのformatメソッドで取得した日時にフォーマットを適用
        System.out.println("フォーマット後: " + formattedDateTime);//コンソール出力
    }
}