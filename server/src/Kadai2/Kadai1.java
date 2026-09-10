package Kadai2;

//課題1 - **やること:**`calculate` という名前のメソッドを作ります。
// ただし、引数として渡される数字の数によって、以下のようにおまかせで計算方法が変わるようにしてください。
//    1. **引数が1つの場合：** その値の「2乗（その数 × その数）」を返す。
//    2. **引数が2つの場合：** その2つの値の「積（掛け算）」を返す。

public class Kadai1 {//クラスの作成
    public static void calculate(int a){//メソッドの作成(引数:a(int))
        System.out.println(a*a);//コンソール出力:a×aの結果
    }
    public static void calculate(int a,int b){//メソッドの作成(引数:a(int),b(int))
        System.out.println(a*b);//コンソール出力:a×bの結果
    }
    public static void main(String[] args) {//mainメソッド
        calculate(5);//引数1つの場合
        calculate(3,4);//引数2つの場合
    }
}
