package Kadai1;
//以下のプロパティを持つクラスPersonを作成してください:id（int型）,name（String型）,age（int型）
public class Kadai1_7 {
    //フィールド(プロパティの宣言、クラスの中で使える変数、privateで直接アクセスできないようにする)
    private int id;
    private String name;
    private int age;

    //コンストラクタ(呼び出された時に引数を受け取って、フィールドに値を代入する)
    public Kadai1_7(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    //メソッド(フィールドの値を返す、フィールド値はprivateだがメソッドをpublicにすることで外部からアクセスできるようにする)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
