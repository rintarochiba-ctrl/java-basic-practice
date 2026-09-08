package Kadai2;
//課題3 ユーザーが入力した文字列を受け取り、文字の順番を逆（後ろから）にして出力してください。
//（例：「java」と入力されたら「avaj」と出力する）
import java.util.Scanner;

public class Kadai3 {
    public static void toReverse(String text){
        System.out.println("文字列を逆順にすると:"+text);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("英語を入力してください: ");
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        toReverse(sb.reverse().toString());
        scanner.close();
    }
}
