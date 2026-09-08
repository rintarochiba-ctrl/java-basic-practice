package Kadai2.Examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCountExample {
    public static void main(String[] args) {
        String filePath = "./server/src/Kadai2/Examples/example.txt"; // 読み込むファイル名
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while (br.readLine() != null) { // 1行ずつ読み込む
                lineCount++;
            }
            System.out.println("ファイルの行数: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// 出力結果
// ファイルの行数: 2