package Kadai2.Examples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // フォーマット指定
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // フォーマットして出力
        String formattedDateTime = now.format(formatter);
        System.out.println("フォーマット後: " + formattedDateTime);
    }
}

// 出力結果
// フォーマット後: 2024-02-01 15:30:45