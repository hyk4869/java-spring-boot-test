package Basic;

public class Condition {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int price = Integer.parseInt(args[0]);
		double rate = 0.10;
		int discount, amount;

		if (price >= 3000) {
			discount = 300;
		} else if (price >= 2500) {
			discount = 250;
		} else {
			discount = 0;
		}

		amount = (int) ((price - discount) * (1 - rate));
		System.out.println("値引金額：" + discount + "円");
		System.out.println("税込金額：" + amount + "円");
	}

}
