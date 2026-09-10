package Kadai2.Examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCountWithScanner {
    public static void main(String[] args) {
        File file = new File("./server/src/Kadai2/Examples/example.txt");
        int lineCount = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) { // 次の行がある限りループ
                scanner.nextLine();
                lineCount++;
            }
            System.out.println("ファイルの行数: " + lineCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}