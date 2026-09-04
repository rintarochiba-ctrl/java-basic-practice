package Kadai1;
//2 配列の合計を計算してみよう 配列{1, 2, 3, 4, 5}の全ての要素を足して、その合計を出力してください。
public class Kadai3_2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
