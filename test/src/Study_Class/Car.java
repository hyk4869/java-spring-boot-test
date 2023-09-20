package Study_Class;

public class Car {
	//設計図クラスを作ってインスタンス化するプログラムを書こう！【Java入門講座】3-4 演習問題

	int no;
	int speed;

	void setNo(int n) {
		no = n;
	}

	void run(int s) {
		speed = s;
	}

	void stop() {
		speed = 0;
	}

	void display() {
		System.out.println("ナンバー" + no + "の速度は" + speed + "です");
	}
}
