package Kadai1;
//4 文字列を結合する関数を作りましょう 2つの文字列を引数として受け取り、それらを結合して返す関数を作成してください。
public class Kadai2_4 {
    public static void main(String[] args) {
        String result = concatenate("千葉", "倫太郎");
        System.out.println(result);
    }

    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }
}
