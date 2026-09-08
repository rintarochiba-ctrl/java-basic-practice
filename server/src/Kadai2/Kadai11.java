package Kadai2;
//課題11 ストリームを使ってデータを一気に変換しよう！
//新しく StreamPractice.java というファイルを作成し、処理を書いてみましょう。
import java.util.Arrays;
import java.util.List;

public class Kadai11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,5,7,2,8);

        List<Integer> doubledNumbers = numbers.stream()
                                             .map(n -> n * 2)  // 各要素を 2 倍に変換
                                             .toList();  // 結果をリストに変換
        System.out.println(doubledNumbers);
    }
}

