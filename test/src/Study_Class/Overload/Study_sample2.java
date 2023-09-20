package Study_Class.Overload;

public class Study_sample2 {

	public static void main(String[] args) {
		Study_overload stu1 = new Study_overload();
		Study_overload stu2 = new Study_overload();

		stu1.setData("鈴木");
		stu1.setScore(90, 80);
		stu1.display();

		stu2.setData("村山", 75, 80);
		stu2.display();
	}

}
