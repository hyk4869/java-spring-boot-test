package Study_inheritance.Mondai4;

public class Taxi1 extends Car1 {

	private int price;

	public void start() {
		price = 420;
	}

	public void run() {
		price = price + 80;
	}

	// オーバーライド　メソッドの定義である　戻り値の型、メソッド名、引数の情報　全部スーパークラスと合わせる
	public void display() {
		System.out.println("料金は" + price + "円です。");
	}

}
