package Study_Class.Static_Method;

public class StuSample4 {

	public static void main(String[] args) {
		// static変数、staticメソッドの使いどころやメモリ内の動き【Java入門講座】3-7 static
		//全インスタンスで共通して使えるメンバ変数やメソッドを定義するのに使うもの

		//		Student4 stu1 = new Student4("鈴木");
		//		stu1.display();

		Student4 stu1 = new Student4("鈴木");
		Student4.display();

		//		Student4 stu2 = new Student4("田中");
		//		stu2.display();

		Student4 stu2 = new Student4("田中");
		Student4.display();

	}

}
