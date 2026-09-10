package Kadai2;

//課題7 自動で伸びる箱にデータを入れてみよう！ 以下の5つの名前を ArrayList に格納し、リストの中身をすべて出力してください。
//データ："田中", "佐藤", "久保田", "鈴木", "河本"

import java.util.ArrayList;//ArrayListクラスのインストール

public class Kadai7 {//クラスの作成
    public static void main(String[] args) {//mainメソッド

        ArrayList<String> names = new ArrayList<>();//ArrayListクラス(String)でリストの作成

        names.add("田中");//ArrayListへ要素の追加
        names.add("佐藤");
        names.add("久保田");
        names.add("鈴木");
        names.add("河本");

        System.out.println(names);//リストの中身の出力
    }
}
