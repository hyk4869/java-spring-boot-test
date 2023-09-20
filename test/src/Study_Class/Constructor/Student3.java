package Study_Class.Constructor;

public class Student3 {

	//コンストラクタを作る３つのコツと使うメリットとは？【Java入門講座】3-6 コンストラクタ

	String name;
	int engScore;
	int mathScore;

	Student3(String n) {
		name = n;
	}

	Student3(String n, int e, int m) {
		name = n;
		engScore = e;
		mathScore = m;
	}

	void setScore(int e, int m) {
		engScore = e;
		mathScore = m;
	}

	void display() {
		System.out.println(name + "さん");
		System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
	}

}
