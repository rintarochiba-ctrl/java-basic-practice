package Kadai1;

public class Kadai5_3{
    private static int[] numbers = {5,10,15,20};
    public static void reversNumbers(){
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
    public static void main(String[] args) {
        Kadai5_3.reversNumbers();
    }
}