package Kadai1;
//3 コンストラクタを作成してみよう Carクラスにコンストラクタを追加し、brandとspeedを初期化できるようにしてください。
public class Kadai4_3 {
    private String brand;
    private int speed;

    public Kadai4_3(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return "brand: " + brand;
    }

    public String getSpeed() {
        return "speed: " + speed;
    }

    public static void main(String[] args) {
        Kadai4_3 car = new Kadai4_3("Toyota", 120);

        System.out.println(car.getBrand());
        System.out.println(car.getSpeed());
    }
}
