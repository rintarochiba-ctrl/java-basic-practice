package Kadai2.Examples;

import java.io.File;

public class FileExistenceCheck {
    public static void main(String[] args) {
        // 確認したいファイルのパスを指定
        String filePath = "test.txt";

        // Fileオブジェクトを作成
        File file = new File(filePath);

        // ファイルが存在するかチェック
        if (file.exists()) {
            System.out.println("ファイルは存在します。");
        } else {
            System.out.println("ファイルは存在しません。");
        }
    }
}

// 出力結果(存在する場合)
// ファイルは存在します。
// 出力結果(存在しない場合)
// ファイルは存在しません。