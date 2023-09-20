package Study_Class.Static_Method;

public class Student4 {

	String name;
	//	int counter;
	static int counter;

	//コンストラクタ
	Student4(String n) {
		name = n;
		counter++;
		System.out.println(name + "さんをインスタンス化しました");

	}

	//	void display() {
	//		System.out.println(counter + "人です");
	//	}

	static void display() {
		System.out.println(counter + "人です");
	}

}
