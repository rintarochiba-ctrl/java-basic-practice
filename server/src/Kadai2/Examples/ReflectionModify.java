package Kadai2.Examples;

import java.lang.reflect.*;

class Car {
    private String brand = "Toyota";

    public String getBrand() {
        return brand;
    }
}

public class ReflectionModify {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        Class<?> clazz = car.getClass();

        Field brandField = clazz.getDeclaredField("brand");
        brandField.setAccessible(true); // 🔥 プライベートフィールドを変更可能にする
        brandField.set(car, "Tesla");

        System.out.println("変更後のブランド: " + car.getBrand());
    }
}
// 出力結果
// 変更後のブランド: Tesla
