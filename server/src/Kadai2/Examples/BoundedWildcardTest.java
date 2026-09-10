package Kadai2.Examples;

import java.util.List;
import java.util.Arrays;

class BoundedWildcardExample {
    public static double sum(List<? extends Number> list) { // 🔥 Numberのサブクラスのみ許可
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}

public class BoundedWildcardTest {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(2.5, 3.5, 4.5);

        System.out.println("整数リストの合計: " + BoundedWildcardExample.sum(intList));
        System.out.println("小数リストの合計: " + BoundedWildcardExample.sum(doubleList));
    }
}
// 出力結果
// 整数リストの合計: 6.0
// 小数リストの合計: 10.5