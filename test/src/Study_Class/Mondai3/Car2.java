package Study_Class.Mondai3;

public class Car2 {
	int no;
	int speed;

	// オーバーロードは同じのメソッド名を複数作ることができる
	void setNo(int n) {
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
