package Kadai1;
//4 二次元配列を操作してみよう 以下の二次元配列を作成し、各行の要素を順番に出力してください：
public class Kadai3_4 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}