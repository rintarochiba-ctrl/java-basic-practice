package Kadai1;
//配列を使った操作をしてみよう
//1 配列の要素を表示してみよう 配列{10, 20, 30, 40, 50}の要素を、for文を使って順に出力してください。
public class Kadai3_1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    
}
