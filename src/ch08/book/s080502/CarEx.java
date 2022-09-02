package ch08.book.s080502;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
				
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}
}
