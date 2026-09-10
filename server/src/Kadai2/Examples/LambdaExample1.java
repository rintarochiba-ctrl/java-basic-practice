package Kadai2.Examples;
//例
import java.util.Arrays;
import java.util.List;

public class LambdaExample1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("田中", "佐藤", "鈴木");

        // 通常のforループ
        for (String name : names) {
            System.out.println(name);
        }

        // ラムダ式（forEach）
        names.forEach(name -> System.out.println(name));
    }
}

// 出力結果
// 田中
// 佐藤
// 鈴木