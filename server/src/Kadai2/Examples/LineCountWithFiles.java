package Kadai2.Examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LineCountWithFiles {
    public static void main(String[] args) {
        Path filePath = Paths.get("./server/src/Kadai2/Examples/example.txt");

        try {
            long lineCount = Files.lines(filePath).count(); // 行数を取得
            System.out.println("ファイルの行数: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// 出力結果
// ファイルの行数: 2