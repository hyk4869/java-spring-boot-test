package Exception_handling;

public class Divide1 {

	public static void main(String[] args) {
		// 例外処理の書き方やプログラムの流れを初心者向けに解説【Java入門講座】5-2 例外処理

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("計算開始");
			System.out.println("a/b = " + (a / b) + " 、あまり " + (a % b));
			System.out.println("計算終了");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2つの数値を入力してください");
			System.out.println("詳細： " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("例外が発生しました");
			System.out.println("詳細: " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("プログラムを終了します。");
		}
	}

}
