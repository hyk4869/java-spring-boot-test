package Basic;

public class Data_type {

	public static void main(String[] args) {
		//自動補完↓
		//https://digital-literacy88.com/eclipse-hokan/

		int month = 12;
		int day = 29;
		float weight = 63.0f; //小数の後にfを付ける
		double height = 168.5;
		char bloodType = 'A'; //charは、シングルクォーテーションを付ける

		String name = "鈴木"; //ダブルクォーテーション

		System.out.println("こんにちは" + name + "です。");
		System.out.println("身長は" + height + "cm、体重は" + weight + "kg、");
		System.out.println("誕生日は" + month + "月" + day + "日、");
		System.out.println("血液型は" + bloodType + "型です。");

	}

}
