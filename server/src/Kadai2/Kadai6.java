package Kadai2;

//課題6 ファイルを作って、読んでみよう！
//やること: プログラムを実行すると、自動的に example.txt というファイルが作成され、以下の2行が書き込まれるようにしてください。
//Hello, Java!
//This is a file example.
//条件:書き込みには FileWriter、読み込みには BufferedReader を使用してください。

import java.io.BufferedReader;//BufferedReaderクラスをインストール
import java.io.FileWriter;//FileWriterクラスをインストール
import java.io.FileReader;//FileReaderクラスをインストール

public class Kadai6 {//クラスの作成
    public static void main(String[] args) {//mainメソッド
        try {//ファイル操作ではエラーが発生する可能性があるため、try-catchで囲む
            FileWriter writer = new FileWriter("example.txt");//FileWriterクラスを使ってexample.txtというファイルを作成
            writer.write("Hello, Java!\n");//write()でファイルに文字列を書き込む \nで改行
            writer.write("This is a file example.\n");
            writer.close();//writerを閉じる
            System.out.println("example.txt ファイルを作成しました。");//コンソール出力

            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));//BufferedReaderクラスを使ってexample.txtというファイルを読み込む
            String line;//String型の変数lineを宣言
            while ((line = reader.readLine()) != null) {//readLine()で1行ずつ読み込む 読み込む行がなくなるとnullを返す
                System.out.println(line);
            }
            reader.close();//readerを閉じる
        } catch (java.io.IOException e) {//IOExceptionはファイル操作で発生するエラーの親クラス,エラー内容をeに格納
            System.out.println("ファイルの作成中にエラーが発生しました: " + e.getMessage());//エラー内容からmessage部分を取得し出力
        }
    }
}
