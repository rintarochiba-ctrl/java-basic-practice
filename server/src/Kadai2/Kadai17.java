package Kadai2;
//課題17 ファイルの行数を自動でカウントしよう！
//example.txt というファイルを読み込み、そのファイルが「全部で何行あるか」を数えてコンソールに出力してください。

import java.io.BufferedReader;//BufferedReaderを使ってファイルを読み込むためのインポート
import java.io.FileReader;//FileReaderを使ってファイルを読み込むためのインポート
import java.io.IOException;//IOExceptionを使ってファイルの読み込み時の例外処理を行うためのインポート

public class Kadai17 {
    public static void main(String[] args) {//mainメソッドの開始
        String filePath = "./server/src/Kadai2/Examples/example.txt"; // 読み込むファイル名
        int lineCount = 0;//行数をカウントするための変数を初期化

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {//BufferedReaderを使ってファイルを読み込む
            while (br.readLine() != null) { // 1行ずつ読み込む
                lineCount++;//行数をカウント
            }
            System.out.println("ファイルの行数: " + lineCount);//行数をコンソールに出力
        } catch (IOException e) {//IOExceptionが発生した場合の例外処理
            e.printStackTrace();//例外の内容をコンソールに出力
        }
    }
}
