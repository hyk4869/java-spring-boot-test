package Study_inheritance.Inheritance1;

public class StuSample {

	public static void main(String[] args) {
		Student stu = new Student();

		//スーパークラスのメソッド
		stu.setName("鈴木");
		stu.display();

		//サブクラスのメソッド
		stu.setStuNo(1);
		stu.displayStuNo();
	}

}
