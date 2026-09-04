package Kadai1;
//1 偶数を表示するプログラムを作りましょう 1から20までの数字の中で偶数のみを出力してください。
public class Kadai5_1 {
    public static void printEvenNumbers(){
        for (int i = 1;i<=20;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printEvenNumbers();
    }
}
