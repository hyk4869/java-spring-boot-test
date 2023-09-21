package Study_inheritance.ThisAndSuper;

public class Student3 extends Person3 {

	private int stuNo;

	// コンストラクタ
	public Student3(String name) {
		this(name, 999);
	}

	// コンストラクタ
	public Student3(String name, int stuNo) {
		super(name);
		this.stuNo = stuNo;
	}

	// スーパークラスのdisplayをオーバーライド
	public void display() {
		super.display();
		System.out.println("学籍番号: " + stuNo);
	}
}
