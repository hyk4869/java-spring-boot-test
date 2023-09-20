package Study_Class.Overload;

public class Study_overload {
	//オーバーロードのメリット（作る側・呼び出す側）を解説します！【Java入門講座】3-5 オーバーロード

	String name;
	int engScore;
	int mathScore;

	void setData(String n) {
		name = n;
	}

	void setData(String n, int e, int m) {
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
