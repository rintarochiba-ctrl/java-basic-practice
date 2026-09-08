package Kadai2.Examples;

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("ワンワン！");
    }
}

public class ReflectionInterface {
    public static void main(String[] args) {
        Class<?> clazz = Dog.class;
        Class<?>[] interfaces = clazz.getInterfaces();

        System.out.println("実装しているインターフェース:");
        for (Class<?> iface : interfaces) {
            System.out.println(iface.getName());
        }
    }
}
// 出力結果
// 実装しているインターフェース:
// Animal
