package Study_inheritance.Final;

public class StuSample4 {

	public static void main(String[] args) {
		final int BASE_NO = 1000;
		Student4 stu1 = new Student4("田中", BASE_NO + 1);
		stu1.display();

		Student4 stu2 = new Student4("鈴木", BASE_NO + 2);
		stu2.display();

	}

}
