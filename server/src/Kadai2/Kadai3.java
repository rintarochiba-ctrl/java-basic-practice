package Kadai2;
//課題3 ユーザーが入力した文字列を受け取り、文字の順番を逆（後ろから）にして出力してください。
//（例：「java」と入力されたら「avaj」と出力する）
import java.util.Scanner;//Scannerクラスをインストール

public class Kadai3 {//クラスを作成
    public static void toReverse(String text){//文字列を逆順に変えるメソッドを作成
        System.out.println("文字列を逆順にすると:"+text);//コンソール出力
    }
    public static void main(String[] args) {//mainメソッド
        Scanner scanner = new Scanner(System.in);//Scannerクラスでインスタンス化
        System.out.print("英語を入力してください: ");//文字の入力
        String input = scanner.nextLine();//入力文字をinputに格納
        StringBuilder sb = new StringBuilder(input);//StringBuilder型(文字列を操作できる形)に変換
        toReverse(sb.reverse().toString());//SBクラスのreverseメソッドで逆順に,toStringメソッドでString型に戻す
        scanner.close();//Scannerを閉じる
    }
}
