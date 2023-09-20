package Study_Class.Mondai3;

public class Car4 {
	private int no;
	private int speed;

	// カプセル化
	public Car4() {
		no = 0;
	}

	public Car4(int n) {
		no = n;
	}

	public void run(int s) {
		speed = s;
	}

	public void brake() {
		speed = 0;
	}

	public void brake(int s) {
		speed = speed - s;
	}

	public void display() {
		System.out.println("ナンバー" + no + "の速度は" + speed + "です");
	}
}
