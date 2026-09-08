package Kadai2.Examples;

import java.io.File;

public class FileTypeCheck {
    public static void main(String[] args) {
        String filePath = "test.txt"; // 確認したいパス

        File file = new File(filePath);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println(filePath + " はファイルです。");
            } else if (file.isDirectory()) {
                System.out.println(filePath + " はディレクトリです。");
            }
        } else {
            System.out.println("ファイルまたはディレクトリは存在しません。");
        }
    }
}