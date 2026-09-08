package Kadai2.Examples;

import java.util.ArrayList;
//例
public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayListの作成
        ArrayList<String> names = new ArrayList<>();

        // 要素の追加
        names.add("田中");
        names.add("佐藤");
        names.add("久保田");
        names.add("鈴木");
        names.add("河本");

        // リストの出力
        System.out.println(names);
    }
}