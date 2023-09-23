package Study_inheritance.Mondai4;

public class Taxi2 extends Car2 {

	private int price;

	public Taxi2(int no) {
		this(no, 0);
	}

	public Taxi2(int no, int price) {
		super(no);
		this.price = price;
	}

	public void start() {
		price = 420;
	}

	public void run() {
		price = price + 80;
	}

	// オーバーライド　メソッドの定義である　戻り値の型、メソッド名、引数の情報　全部スーパークラスと合わせる
	public void display() {
		super.display();
		System.out.println("料金は" + price + "円です。");
	}

}
