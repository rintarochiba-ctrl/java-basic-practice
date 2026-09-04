package Kadai1;

public class Kadai6_1 {
    public static int[] numbers = {1,2,3};
    public static void printNumbers(){
        for (int i = 0; i <= numbers.length; i++){
            if (i < numbers.length){
                System.out.println(numbers[i]);
            } else {
                throw new IndexOutOfBoundsException("配列の範囲外です");
            }
        }
    }
    public static void main(String[] args) {
        try {
            Kadai6_1.printNumbers();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
