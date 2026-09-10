package Kadai2.Examples;
//例
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMapの作成
        HashMap<String, String> map = new HashMap<>();

        // 要素の追加
        map.put("baseball", "野球");
        map.put("basketball", "バスケットボール");
        map.put("soccer", "サッカー");

        // HashMapの出力
        System.out.println(map);
    }
}

// 実行結果
// {baseball=野球, basketball=バスケットボール, soccer=サッカー}