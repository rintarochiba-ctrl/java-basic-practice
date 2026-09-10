package Kadai2.Examples;

import java.lang.reflect.*;

class Person {
    //private String name;
    public int age;

    public Person() {}

    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        Class<?> clazz = Person.class;

        // 🔹 フィールド一覧を取得
        System.out.println("【フィールド一覧】");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " (" + field.getType() + ")");
        }

        // 🔹 メソッド一覧を取得
        System.out.println("\n【メソッド一覧】");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}

// 出力結果
// 【フィールド一覧】
// name (class java.lang.String)
// age (int)
// 【メソッド一覧】
// sayHello