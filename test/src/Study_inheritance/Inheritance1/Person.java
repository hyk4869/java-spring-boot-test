package Study_inheritance.Inheritance1;

public class Person {

	// 継承のメリットやextendsの使い方を理解しよう【Java入門講座】4-1 継承
	// 継承できるクラスは1つ
	// コンストラクタは継承しない

	private String name;

	public void setName(String n) {
		name = n;
	}

	public void display() {
		System.out.println("名前： " + name);
	}
}
