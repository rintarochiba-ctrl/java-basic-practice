package Kadai2.Examples;

import java.io.File;

public class FileReadCheck {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.exists() && file.canRead()) {
            System.out.println("ファイルは読み取り可能です。");
        } else {
            System.out.println("ファイルは読み取り不可です。");
        }
    }
}
