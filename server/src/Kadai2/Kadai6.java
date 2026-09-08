package Kadai2;
import java.io.BufferedReader;
//課題6 ファイルを作って、読んでみよう！
//やること: プログラムを実行すると、自動的に example.txt というファイルが作成され、以下の2行が書き込まれるようにしてください。
//Hello, Java!
//This is a file example.
//条件:書き込みには FileWriter、読み込みには BufferedReader を使用してください。
public class Kadai6 {
    public static void main(String[] args) {
        try {//ファイル操作ではエラーが発生する可能性があるため、try-catchで囲む
            java.io.FileWriter writer = new java.io.FileWriter("example.txt");//FileWriterクラスを使ってexample.txtというファイルを作成
            writer.write("Hello, Java!\n");//write()でファイルに文字列を書き込む \nで改行
            writer.write("This is a file example.\n");
            writer.close();
            System.out.println("example.txt ファイルを作成しました。");

            BufferedReader reader = new BufferedReader(new java.io.FileReader("example.txt"));//BufferedReaderクラスを使ってexample.txtというファイルを読み込む
            String line;//String型の変数lineを宣言
            while ((line = reader.readLine()) != null) {//readLine()で1行ずつ読み込む 読み込む行がなくなるとnullを返す
                System.out.println(line);
            }
            reader.close();
        } catch (java.io.IOException e) {//IOExceptionはファイル操作で発生するエラーの親クラス
            System.out.println("ファイルの作成中にエラーが発生しました: " + e.getMessage());
        }
    }
}
