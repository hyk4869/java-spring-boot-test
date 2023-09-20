package Basic;

public class Calculator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 実行の構成➡引数➡プログラムの引数
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println("a = " + a + ", b = " + b);
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		System.out.println("a >= b = " + (a >= 0));
		System.out.println("(a >= 0) && (b >= 0) = " + ((a >= 0) && (b >= 0)));

	}

}
