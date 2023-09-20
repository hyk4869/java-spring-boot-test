package Study_Class;

public class First_score {
	//属性とメンバ変数や操作とメソッドの違い、分かってますか？【Java入門講座】3-2 設計図クラス
	// メンバ変数(属性)
	String name;
	int engScore;
	int mathScore;

	// メソッド（操作）
	void display() {
		System.out.println(name + "さん");
		System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
	}

	void setScore(int eng, int math) {
		engScore = eng;
		mathScore = math;
	}

	/**
	 * 平均値の算出
	 * @param 英語
	 * @param 数学
	 * @return 平均値
	 * */
	double getAvg() {
		double avg = (engScore + mathScore) / 2.0;
		return avg; // returnする型と宣言した型を合わせる必要がある。
	}
	//mainメソッドがないため、動作しない。そのため、別オブジェクトでmainを定義する必要がある。
}
