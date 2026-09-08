package Kadai2;
//課題2 ユーザー（実行する人）がキーボードから入力した文字列を受け取り、それをすべて大文字に変換してコンソールに出力してください。
//（例：「hello」と入力されたら「HELLO」と出力する）
import java.util.Scanner;

public class Kadai2 {
    public static void toUpper(String text){
        System.out.println("大文字に変換すると:"+text.toUpperCase());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("英語を入力してください: ");
        String input = scanner.nextLine(); // これで入力された文字が input という箱に入ります！
        toUpper(input);
        scanner.close();
    }
}
