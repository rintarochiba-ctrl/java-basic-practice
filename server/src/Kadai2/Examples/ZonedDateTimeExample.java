package Kadai2.Examples;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        // 東京の現在時刻
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        // フォーマット
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("東京の現在時刻: " + tokyoTime.format(formatter));
    }
}
// 出力結果
// 東京の現在時刻: 2024-02-01 15:30:45 JST