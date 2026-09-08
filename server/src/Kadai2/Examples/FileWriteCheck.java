package Kadai2.Examples;

import java.io.File;

public class FileWriteCheck {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.exists() && file.canWrite()) {
            System.out.println("ファイルは書き込み可能です。");
        } else {
            System.out.println("ファイルは書き込み不可です。");
        }
    }
}