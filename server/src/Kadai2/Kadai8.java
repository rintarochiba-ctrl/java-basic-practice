package Kadai2;
//課題8 **IT用語辞典を作ってみよう！** 新しく `HashMapPractice.java` というファイルを作成し、処理を書いてみましょう。
//- **やること:**以下のIT用語ペアを持つ `HashMap` を作成し、それぞれの「キー」と「値」を順番に出力してください。
//- "Java" : "プログラミング言語"
//- "Spring" : "フレームワーク"
//- "JUnit" : "テストツール"
import java.util.HashMap;

public class Kadai8 {
    public static void main(String[] args) {
        // HashMapの作成
        HashMap<String, String> map = new HashMap<>();

        // 要素の追加
        map.put("Java", "プログラミング言語");
        map.put("Spring", "フレームワーク");
        map.put("JUnit", "テストツール");

        // HashMapの出力
        map.entrySet().forEach(entry ->//entrySet()でHashMapの中身をセットにしてforEachで1つずつentryに格納
            System.out.println(entry.getKey() + " : " + entry.getValue())//getKeyとgetValueでキーと値を取得して出力
        );
    }
}