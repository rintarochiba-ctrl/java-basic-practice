package Kadai2.Examples;

import java.io.File;

public class FileCheckWithExceptionHandling {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");

            if (file.exists()) {
                System.out.println("ファイルは存在します。");
            } else {
                System.out.println("ファイルは存在しません。");
            }
        } catch (Exception e) {
            System.out.println("エラーが発生しました: " + e.getMessage());
        }
    }
}