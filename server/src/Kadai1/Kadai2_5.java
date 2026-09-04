package Kadai1;
//5 戻り値のない関数を作りましょう 引数に年齢（int型）を受け取り、「未成年」または「成人」と出力する関数を作成してください。
public class Kadai2_5 {
    public static void main(String[] args) {
        checkAge(15);
        checkAge(25);
    }

    public static void checkAge(int age) {
        if (age < 20) {
            System.out.println("未成年");
        } else if (age >= 20) {
            System.out.println("成人");
        }
    }
}
