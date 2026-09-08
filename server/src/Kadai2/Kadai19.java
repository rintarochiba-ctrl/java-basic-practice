package Kadai2;

//課題19 Personクラスのフィールド名とメソッド名をすべて取得し、順に出力してください。

import java.lang.reflect.*;//リフレクション機能を持つパッケージをインストール

class Person {
    public String name;
    public int age;

    public Person() {}

    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayWorld() {
        System.out.println("World!");
    }
}

public class Kadai19 {//クラスの作成
    public static void main(String[] args) {//mainメソッド
        Class<?> clazz = Person.class;//Classクラスの.classでPersonクラスを取得<?>はどの型でも良いという示唆

        //フィールド一覧を取得
        System.out.println("【フィールド一覧】");
        Field[] fields = clazz.getDeclaredFields();//フィールド要素を取得
        for (Field field : fields) {//for ofループで値を取得
            System.out.println(field.getName());//フィールド要素の名前部分を出力
        }

        //メソッド一覧を取得
        System.out.println("\n【メソッド一覧】");
        Method[] methods = clazz.getDeclaredMethods();//メソッド要素を取得
        for (Method method : methods) {//for ofループで値を取得
            System.out.println(method.getName());//メソッド要素の名前部分を出力
        }
    }
}

// 出力結果
// 【フィールド一覧】
// name (class java.lang.String)
// age (int)
// 【メソッド一覧】
// sayHello
// sayWorld