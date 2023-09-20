package Basic;

public class Loop_for {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < 3; i++) {
			System.out.println("i = " + i);
		}

		int[] score = new int[3];
		score[0] = 80;
		score[1] = 100;
		score[2] = 75;
		String[] name = { "鈴木", "田中", "斎藤" };

		for (int j = 0; j < score.length; j++) {
			System.out.println(name[j] + "さん:" + score[j] + "点");
		}
		System.out.println("受験者数" + score.length + "名");
	}

}
