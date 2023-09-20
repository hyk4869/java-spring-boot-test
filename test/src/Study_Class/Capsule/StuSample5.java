package Study_Class.Capsule;

public class StuSample5 {

	public static void main(String[] args) {
		Study_capsule stu1 = new Study_capsule("鈴木");
		stu1.setScore(80);
		stu1.display();

		Study_capsule stu2 = new Study_capsule("田中");
		stu2.setScore(-80);
		//		stu2.score = -80;
		stu2.display();

	}

}
