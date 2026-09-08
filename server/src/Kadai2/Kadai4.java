package Kadai2;
//課題4 コマンドライン引数として「自分の名前」を受け取り、コンソールに「こんにちは、[名前]さん！」と出力してください。
public class Kadai4 {
    public static void main(String[] args) {
        System.out.println("こんにちは、" + args[0] + "さん");
    }
}

//cd server/src/Kadai2 ファイルが保存されているディレクトリへ移動
//$ java CommandLinePractice.java 倫太郎
//出力結果 こんにちは、倫太郎さん