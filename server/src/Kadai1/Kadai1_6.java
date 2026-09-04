package Kadai1;
//6配列を作成してみよう String[]型を使って、以下の名前が含まれる配列を作成してください： "田中", "佐藤", "久保田", "鈴木", "河本"
class Kadai1_6 {
  public static void main(String[] args) {
    String[] names = {"田中","佐藤","久保田","鈴木","河本"};
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
  }
}
//田中
//佐藤
//久保田
//鈴木
//河本