package Basic;

public class Array_study {

	public static void main(String[] args) {
		//	配列の生成にはnewを使う。生成時にデフォルト初期値が設定される。

		int[] score = new int[3];
		score[0] = 80;
		score[1] = 100;
		score[2] = 75;

		String[] name = { "鈴木", "田中", "佐藤" };

		System.out.println(name[0] + "さん：" + score[0] + "点");
		System.out.println(name[1] + "さん：" + score[1] + "点");
		System.out.println(name[2] + "さん：" + score[2] + "点");
		System.out.println("受験者数：" + score.length + "名");
	}

}
