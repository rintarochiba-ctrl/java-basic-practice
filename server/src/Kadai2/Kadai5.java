package Kadai2;
//課題5 年齢制限の専用エラーを作ってみよう！
//18歳未満のユーザーがアクセスしようとしたときに、専用のエラー（InvalidAgeException）を発生させて、それをキャッチして画面に表示してください。

class InvalidAgeException extends Exception {//Exceptionはjavaが用意している共通エラーの親 独自エラー名の作成
    public InvalidAgeException(String message) {
        super(message);//super()で親要素のExceptionのエラーメッセージを設定
    }
}

public class Kadai5{
    public static void checkAge(int age) throws InvalidAgeException{
        if (age < 18) {
            throw new InvalidAgeException("18歳未満はアクセスできません 年齢: " + age + "歳");
        }
        System.out.println(age + "歳です！");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("エラー発生：" + e.getMessage());
        }
    }
}

