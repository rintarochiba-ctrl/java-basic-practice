package Kadai1;
//8 インスタンスを作成し、値を代入してください。
public class Kadai1_8 {
    public static void main(String[] args) {
        //Personクラスを使用、person変数にコンストラクタで新しい人物のデータを登録(引数3つ)
        Kadai1_7 person = new Kadai1_7(1, "John Doe", 30);
        //フィールドをprivateからpublicにすれば直接値を取得できるが、基本的にはメソッドで取得する
        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}