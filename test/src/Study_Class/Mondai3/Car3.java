package Study_Class.Mondai3;

public class Car3 {
	int no;
	int speed;

	// コンストラクタはクラス名に合わせる
	Car3() {
		no = 0;
	}

	Car3(int n) {
		no = n;
	}

	void run(int s) {
		speed = s;
	}

	void brake() {
		speed = 0;
	}

	void brake(int s) {
		speed = speed - s;
	}

	void display() {
		System.out.println("ナンバー" + no + "の速度は" + speed + "です");
	}
}
