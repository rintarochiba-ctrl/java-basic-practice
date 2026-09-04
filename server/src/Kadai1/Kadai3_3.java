package Kadai1;
//3 配列の最大値を求めてみよう 配列{3, 5, 7, 2, 8}から、最大値を求めて出力してください。
public class Kadai3_3 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
