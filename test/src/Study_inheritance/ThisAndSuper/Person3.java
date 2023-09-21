package Study_inheritance.ThisAndSuper;

public class Person3 {

	// thisとsuperの使い方を初心者向けに解説【Java入門講座】4-3 thisとsuper
	// メンバ変数やメソッドの呼び出し
	// 自身のオブジェクト　this
	// スーパークラスのオブジェクト super
	//
	// thisとsuperによるコンストラクタの呼び出し

	private String name;

	// コンストラクタ
	public Person3(String name) {
		// メンバ変数のnameをthis.nameに代入。 thisは上のnameを指している
		this.name = name;
	}

	public void display() {
		System.out.println("名前: " + name);
	}
}
