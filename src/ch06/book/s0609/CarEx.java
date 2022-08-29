package ch06.book.s0609;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car ("벤츠");
		
		myCar.run();
		yourCar.run(); //각자의 기능
	}
}
