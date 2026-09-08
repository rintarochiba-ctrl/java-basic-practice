package Kadai2;
//課題5 年齢制限の専用エラーを作ってみよう！
//18歳未満のユーザーがアクセスしようとしたときに、専用のエラー（InvalidAgeException）を発生させて、それをキャッチして画面に表示してください。

class InvalidAgeException extends Exception {//Exceptionはjavaが用意している共通エラーの親 独自エラー名の作成
    public InvalidAgeException(String message) {
        super(message);//super()で親要素のExceptionのエラーメッセージを設定
    }
}

public class Kadai5{//クラスの作成
    public static void checkAge(int age) throws InvalidAgeException{//checkAgeメソッドがこのエラーを投げる可能性を示唆
        if (age < 18) {
            throw new InvalidAgeException("18歳未満はアクセスできません 年齢: " + age + "歳");//18歳未満の場合このエラーを投げる
        }
        System.out.println(age + "歳です！");//18歳以上の場合コンソール出力するだけ
    }

    public static void main(String[] args) {//mainメソッド
        try {//エラーを投げる可能性があるメソッドを使う場合はtry/catch
            checkAge(15);//15歳の場合
        } catch (InvalidAgeException e) {//エラー内容を変数eに格納
            System.out.println("エラー発生：" + e.getMessage());//エラー内容eのメッセージ部分を取得し出力
        }
    }
}

