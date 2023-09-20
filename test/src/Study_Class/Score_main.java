package Study_Class;

public class Score_main {

	public static void main(String[] args) {
		//インスタンス化の方法とメモリ内部の動きを解説！【Java入門講座】3-3 オブジェクトの使い方
		//実行用のmainメソッド
		First_score score = new First_score();

		score.name = "斎藤";
		score.setScore(90, 80);

		score.display();
		System.out.println("平均" + score.getAvg() + "点");
	}

}
