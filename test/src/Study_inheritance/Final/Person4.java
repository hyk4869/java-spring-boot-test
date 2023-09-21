package Study_inheritance.Final;

public class Person4 {

	// finalの意味と使い分けをシンプルに解説【Java入門講座】4-4 final
	// final場所によって意味が異なる

	// class これ以上継承できなくなる
	// メンバ変数 変数への代入ができなくなる
	// メソッド メソッドの上書き（オーバーライドが出来なくなる）

	private String name;

	public Person4(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("名前: " + name);
	}

}
