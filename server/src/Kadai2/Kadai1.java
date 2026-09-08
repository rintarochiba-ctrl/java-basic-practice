package Kadai2;

//課題1 - **やること:**`calculate` という名前のメソッドを作ります。
// ただし、引数として渡される数字の数によって、以下のようにおまかせで計算方法が変わるようにしてください。
//    1. **引数が1つの場合：** その値の「2乗（その数 × その数）」を返す。
//    2. **引数が2つの場合：** その2つの値の「積（掛け算）」を返す。
public class Kadai1 {
    public static void calculate(int a){
        System.out.println(a*a);
    }
    public static void calculate(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        calculate(5);
        calculate(3,4);
    }
}
