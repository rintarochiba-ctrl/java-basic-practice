package Kadai2.Examples;

import java.time.LocalDateTime;

public class SpecificDateTimeExample {
    public static void main(String[] args) {
        // 2025年1月1日 12:30:00 を作成
        LocalDateTime newYear = LocalDateTime.of(2025, 1, 1, 12, 30, 0);
        System.out.println("指定した日時: " + newYear);
    }
}
// 出力結果
// 指定した日時: 2025-01-01T12:30:00