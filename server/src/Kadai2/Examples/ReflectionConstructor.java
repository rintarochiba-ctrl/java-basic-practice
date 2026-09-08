package Kadai2.Examples;

import java.lang.reflect.*;

class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public void show() {
        System.out.println("ユーザー名: " + username);
    }
}

public class ReflectionConstructor {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = User.class;
        
        Constructor<?> constructor = clazz.getConstructor(String.class);
        User user = (User) constructor.newInstance("Alice"); // 🔥 動的にインスタンス生成

        user.show();
    }
}

// 出力結果
// ユーザー名: Alice