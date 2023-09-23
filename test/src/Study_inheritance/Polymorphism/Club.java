package Study_inheritance.Polymorphism;

public abstract class Club {

	// ポリモフィズムとは何か、使い方やメリットをコードで解説【Java入門講座】4-7 抽象クラスとポリモーフィズム

	// 2種類の継承
	// 機能追加　共通点のまとめ
	// 	実装内容を持たないメソッドを抽象メソッドとよびabstractを付ける
	// 抽象メソッドを持つクラスを抽象クラスとよびabstractを付ける。インスタンス化はできない。
	// Studentクラスのメソッドはclubオブジェクトによって異なる処理　＝　ポリモフィズム（多態性）
	// プログラムの書き方が統一できる。

	private String name;

	public Club(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("部活動： " + name);
	}

	public abstract void practice();
}
