package Kadai2;
//課題11 ストリームを使ってデータを一気に変換しよう！
//新しく StreamPractice.java というファイルを作成し、処理を書いてみましょう。
import java.util.Arrays;//Arraysクラスのインストール
import java.util.List;//Listクラスのインストール

public class Kadai11 {//クラスの作成
    public static void main(String[] args) {//mainメソッド
        List<Integer> numbers = Arrays.asList(3,5,7,2,8);//Listクラスの継承,ArrayListではaddで要素を追加していたがArraysクラスのasListで一気に追加できる

        List<Integer> doubledNumbers = numbers.stream()//Listの親であるCollectionインターフェースが持つstreamメソッド
                                             .map(n -> n * 2)  // 各要素を 2 倍に変換
                                             .toList();  // 結果をリストに変換
        System.out.println(doubledNumbers);//コンソール出力
    }
}

