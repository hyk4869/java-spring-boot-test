package Study_inheritance.ThisAndSuper;

public class StuSample3 {

	public static void main(String[] args) {
		Student3 stu = new Student3("鈴木");
		stu.display();
	}

	// 実行時にStudent3のコンストラクタが呼び出される。this(name,999)➡Stundent3
	// super(name)➡Person3のthis.nameが呼び出される
}
