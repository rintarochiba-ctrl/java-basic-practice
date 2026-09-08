package Kadai2.Examples;

import java.lang.reflect.*;

class Hello {
    public void greet(String name) {
        System.out.println("こんにちは、" + name + "さん！");
    }
}

public class ReflectionInvoke {
    public static void main(String[] args) throws Exception {
        Hello hello = new Hello();
        Class<?> clazz = hello.getClass();

        Method method = clazz.getMethod("greet", String.class);
        method.invoke(hello, "太郎"); // 🔥 動的にメソッドを実行
    }
}
// 出力結果
// こんにちは、太郎さん！