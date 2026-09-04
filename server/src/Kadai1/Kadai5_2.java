package Kadai1;

//2 FizzBuzzプログラムを作りましょう 1から30までの数字について、以下の条件に従って出力してください：
//3の倍数の場合は「Fizz」
//5の倍数の場合は「Buzz」
//3と5の倍数の場合は「FizzBuzz」

public class Kadai5_2 {
    public static void FizzBuzz(){
        for (int i = 1; i <= 30; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }}
    public static void main(String[] args) {
        FizzBuzz();
    }
}

