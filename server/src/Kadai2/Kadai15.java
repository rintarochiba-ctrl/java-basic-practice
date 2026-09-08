package Kadai2;
//課題15 ファイルの生存確認をしてみよう！
//test.txt というファイルが存在するかどうかを確認し、存在する場合は「ファイルは存在します。」、存在しない場合は「ファイルは存在しません。」とコンソールに出力してください。

import java.io.File;//Fileクラスのインストール

public class Kadai15 {//クラスの作成
    public static void main(String[] args) {//mainメソッド
        // 確認したいファイルのパスを指定
        String filePath = "./server/src/Kadai2/test.txt";

        // Fileオブジェクトを作成,コンストラクタの引数はファイルパス
        File file = new File(filePath);

        // ファイルが存在するかチェック(existsメソッド)
        if (file.exists()) {
            System.out.println("ファイルは存在します。");
        } else {
            System.out.println("ファイルは存在しません。");
        }
    }
}
