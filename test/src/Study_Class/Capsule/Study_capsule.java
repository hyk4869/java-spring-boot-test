package Study_Class.Capsule;

public class Study_capsule {
	// TODO 自動生成されたメソッド・スタブ
	// アクセス修飾子の使い方とカプセル化のメリット【Java入門講座】3-8 カプセル化
	// アクセス修飾子　クラス・メンバ変数・メソッドの公開範囲を指定できる
	// メンバ変数は隠蔽（private）して、クラスとメソッドは公開（public）する設計方針をカプセル化

	private String name;
	//	int score;
	private int score;

	public Study_capsule(String n) {
		name = n;
	}

	public void setScore(int s) {
		if (0 <= s && s <= 100) {
			score = s;
		} else {
			System.out.println(name + "さんの点数が範囲外です");
			score = 0;
		}
	}

	void display() {
		System.out.println(name + "さん" + score + "点");
	}

}
