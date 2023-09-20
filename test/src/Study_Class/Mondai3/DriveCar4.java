package Study_Class.Mondai3;

public class DriveCar4 {

	public static void main(String[] args) {
		Car4 c1 = new Car4();
		c1.run(30);
		c1.display();

		Car4 c2 = new Car4(2525);
		//		c2.speed = 50;
		c2.run(50);
		c2.display();

	}

}
