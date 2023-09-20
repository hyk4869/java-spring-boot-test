package Study_inheritance.Override1;

public class Person2 {

	// オーバーライドのメリットと３つの条件【Java入門講座】4-2 オーバーライド
	// サブクラスでスーパークラスのメソッドを再定義することをオーバーライド（上書き）
	// スーパークラスのメソッドをサブクラスで上書きすること。①戻り値の型、②メソッド名、③引数の型と数が全て同じ（合わせる）

	//オーバーロード➡1つのクラスで同じ名前のメソッドを複数定義できるのがオーバーロード

	private String name;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void display() {
		System.out.println("名前： " + name);
	}
}
