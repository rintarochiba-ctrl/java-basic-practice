package Kadai2;
//課題2 ユーザー（実行する人）がキーボードから入力した文字列を受け取り、それをすべて大文字に変換してコンソールに出力してください。
//（例：「hello」と入力されたら「HELLO」と出力する）
import java.util.Scanner;//Scannerクラスをインストール

public class Kadai2 {//クラスの作成
    public static void toUpper(String text){//大文字に変換するメソッドを作成
        System.out.println("大文字に変換すると:" + text.toUpperCase());//StringクラスのtoUpperCaseを使用することで大文字に変換する
    }
    public static void main(String[] args) {//mainメソッド
        Scanner scanner = new Scanner(System.in);//Scannerクラスでインスタンス化
        System.out.print("英語を入力してください: ");//スキャンする文字列を入力
        String input = scanner.nextLine(); // 入力された文字が inputに入る
        toUpper(input);//大文字に変換の関数を実行
        scanner.close();//scannerを閉じる
    }
}
