package Kadai2.Examples;

// 残高不足のエラーを表す例外クラス
class InsufficientBalanceException extends Exception {//Exceptionはjavaが用意している共通エラーの親 独自エラー名の作成
    public InsufficientBalanceException(String message) {
        super(message);//super()で親要素のExceptionのエラーメッセージを設定
    }
}

public class Bank {
    public static void withdraw(int balance, int amount) throws InsufficientBalanceException {//throws エラー名でこのエラーを投げる可能性があると示唆
        if (amount > balance) {
            throw new InsufficientBalanceException("残高不足です！引き出し額: " + amount + "円, 残高: " + balance + "円");//エラーの場合このエラーメッセージをExceptionに渡す
        }
        System.out.println(amount + "円引き出しました！");
    }

    public static void main(String[] args) {
        try {
            withdraw(1000, 5000); // 1,000円しかないのに5,000円引き出そうとする
        } catch (InsufficientBalanceException e) {//エラー名(クラス)が発生したらeという変数に渡す
            System.out.println("エラー発生：" + e.getMessage());//eのMessageに入っている文字列の取得
        }
    }
}

// 実行結果
// エラー発生：残高不足です！引き出し額: 5000円, 残高: 1000円