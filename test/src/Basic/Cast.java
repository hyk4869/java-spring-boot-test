package Basic;

public class Cast {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int price = Integer.parseInt(args[0]);
		double rate = 0.08;
		int amount;

		amount = (int) (price * (1 + rate));
		System.out.println("税込金額：" + amount + "円");
	}

}
